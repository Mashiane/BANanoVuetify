B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public AutoComplete As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private hasHelp As Boolean
	Private hasError As Boolean
	
	Private ht As VMElement
	Private et As VMElement
	Private module As Object
	Private lbl As VMLabel
	Private HasLabel As Boolean
	Private DesignMode As Boolean
	Private temp As VMElement
	Private htext As VMElement
	Private temp1 As VMElement
	Private typeOf As Int
	Private Options As Map
	Private OptionsKV As Map
	Private xmodel As String
End Sub

'initialize the AutoComplete
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMAutoComplete
	ID = sid.tolowercase
	AutoComplete.Initialize(v, ID).SetTag("md-autocomplete")
	lbl.Initialize(vue, $"${ID}lbl"$)
	vue = v
	module = eventHandler
	hasHelp = False
	hasError = False
	SetOnClosed
	SetOnOpened
	SetOnSelected
	SetOnFocus
	SetOnBlur
	Dim st As Object
	SetOnChanged(st)
	'
	HasLabel = False
	lbl.RemoveAttr(":required")
	lbl.RemoveAttr(":disabled")
	lbl.RemoveAttr("v-show")
	lbl.RemoveAttr(":style")
	DesignMode = False
	'
	'OPTION 1
	temp.Initialize(vue, $"${ID}tmp"$).SetTag("template").SetSlot("md-autocomplete-item")
	temp.SetAttrSingle("slot-scope","{ item, term }")
	'
	htext.Initialize(vue, $"${ID}htxt"$).SetTag("md-highlight-text")
	htext.SetAttrSingle(":md-term","term")
	'
	'OPTION 2
	temp1.Initialize(vue, $"${ID}tmp"$).SetTag("template").SetSlot("md-autocomplete-item")
	temp1.SetAttrSingle("slot-scope","{ item, term }")
	'
	htext.SetText($"{{ item }}"$)
	temp1.SetText($"{{ item }}"$)
	
	typeOf = 1
	Options.Initialize 
	OptionsKV.Initialize 
	Return Me
End Sub


private Sub SetOnFocus As VMAutoComplete
	Dim oninput As String = $"${ID}_focus"$
	If SubExists(module, oninput) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, oninput, Array(e))
	SetAttr(CreateMap("@focus":oninput))
	vue.SetCallBack(oninput, cb)
	Return Me
End Sub

private Sub SetOnBlur As VMAutoComplete
	Dim oninput As String = $"${ID}_blur"$
	If SubExists(module, oninput) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, oninput, Array(e))
	SetAttr(CreateMap("@blur":oninput))
	vue.SetCallBack(oninput, cb)
	Return Me
End Sub

'uses another option to render the items
Sub SetHighlight(b As Boolean) As VMAutoComplete
	If b Then 
		typeOf = 1
	Else
		typeOf = 2
	End If
	Return Me
End Sub

public Sub RemoveAttr(sName As String) As VMAutoComplete
	AutoComplete.RemoveAttr(sName)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMAutoComplete
	AutoComplete.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMAutoComplete
	AutoComplete.SetTabIndex(ti)
	Return Me
End Sub

Sub ToString As String
	If HasLabel Then 
		lbl.SetDesignMode(DesignMode)
		lbl.Pop(AutoComplete)
	End If
	temp.SetDesignMode(DesignMode)
	temp1.SetDesignMode(DesignMode)
	htext.SetDesignMode(DesignMode)
	If typeOf = 1 Then
		temp.AddChild(htext)
		temp.Pop(AutoComplete)
	Else
		temp1.Pop(AutoComplete)
	End If
	If hasHelp Then
		ht.SetDesignMode(DesignMode)
		ht.Pop(AutoComplete)
	End If
	If hasError Then
		et.SetDesignMode(DesignMode)
		et.Pop(AutoComplete)
	End If
	Return AutoComplete.tostring
End Sub

Sub SetVModel(k As String) As VMAutoComplete
	k = k.ToLowerCase
	AutoComplete.SetVModel(k)
	xmodel = k
	vue.SetStateSingle($"${ID}vmodel"$, k)
	Return Me
End Sub

Sub SetLabel(l As Object) As VMAutoComplete
	lbl.SetText(l)
	HasLabel = True
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMAutoComplete
	AutoComplete.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMAutoComplete
	AutoComplete.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMAutoComplete
	Dim childHTML As String = child.ToString
	AutoComplete.SetText(childHTML)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMAutoComplete
	AutoComplete.AddClass(c)
	Return Me
End Sub

'add a blank option to a list
private Sub AddBlankOption(lst As List, keyField As String, ValueField As String)
	Dim opt As Map = CreateMap()
	opt.Put(keyField, "")
	opt.Put(ValueField, "--Nothing Selected--")
	lst.InsertAt(0, opt)
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMAutoComplete
	AutoComplete.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMAutoComplete
	AutoComplete.SetStyle(sm)
	Return Me
End Sub

Sub SetStyleSingle(prop As String, sval As Object) As VMAutoComplete
	AutoComplete.SetStyleSingle(prop, sval)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, sval As Object) As VMAutoComplete
	AutoComplete.SetAttrSingle(prop, sval)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMAutoComplete
	AutoComplete.SetPaddingAll(p)
	Return Me
End Sub

'set search options from a list
Sub SetOptions(sourceList As List) As VMAutoComplete
	If DesignMode Then Return Me
	Dim pp As String = $"${ID}source"$
	vue.SetStateSingle(pp, sourceList)
	SetAttr(CreateMap(":md-options": pp))
	Return Me
End Sub

'use a map to generate the items
Sub SetOptionsMap(optionsm As Map) As VMAutoComplete
	Dim pp As String = $"${ID}source"$
	SetHighlight(False)
	If DesignMode Then Return Me
	optionsm.Put("", "--- Nothing Selected ---")
	'save for later use
	OptionsKV = vue.MapClone(optionsm)
	Options = vue.MapCloneSwap(optionsm)
	'
	vue.SetStateSingle($"${ID}options"$, Options)
	vue.SetStateSingle($"${ID}optionskv"$, OptionsKV)
	
	'create new list
	Dim nl As List = vue.MapValues2List(optionsm)
	vue.SetStateSingle(pp, nl)
	AutoComplete.Bind(":md-options", pp)
	Return Me
End Sub

Sub SetID(varName As String, bind As Boolean) As VMAutoComplete
	AutoComplete.SetID(varName, bind)
	Return Me
End Sub

'use an existing state
Sub SetDataSource(sourceTable As String, sourceField As String, displayField As String) As VMAutoComplete
	Dim pp As String = $"${ID}source"$
	SetHighlight(False)
	If DesignMode Then Return Me
	Dim lst As List = vue.GetState(sourceTable, Null)
	Dim optionsm As Map = CreateMap()
	For Each rec As Map In lst
		Dim k As String = rec.Get(sourceField)
		Dim v As String = rec.Get(displayField)
		optionsm.Put(k, v)
	Next
	optionsm.Put("", "--- Nothing Selected ---")
	'
	'save for later use
	OptionsKV = vue.MapClone(optionsm)
	Options = vue.MapCloneSwap(optionsm)
	'
	vue.SetStateSingle($"${ID}options"$, Options)
	vue.SetStateSingle($"${ID}optionskv"$, OptionsKV)
	
	'create new list
	Dim nl As List = vue.MapValues2List(optionsm)
	vue.SetStateSingle(pp, nl)
	AutoComplete.Bind(":md-options", pp)
	Return Me
End Sub

'get a key from the value, use when using SetOptionsMap
Sub GetSelectedKey As String
	'get the state of the selected value
	Dim selValue As String = vue.getstate(xmodel, "")
	If Options.ContainsKey(selValue) Then
		Dim k As String = Options.Get(selValue)
		Return k
	Else
		Return ""
	End If
End Sub

'use when using SetOptionsMap
Sub SetSelectedKey(key As String)
	If OptionsKV.ContainsKey(key) Then
		Dim v As String = OptionsKV.Get(key)
		vue.SetStateSingle(xmodel, v)
	End If
End Sub

Sub SetHelperText(t As String) As VMAutoComplete
	If t = "" Then Return Me
	hasHelp = True
	ht = AutoComplete.SetHelperText(t)
	Return Me
End Sub

Sub SetErrorText(txt As String) As VMAutoComplete
	If txt = "" Then Return Me
	hasError = True
	et = AutoComplete.SetErrorText(txt)
	Return Me
End Sub

'The input name attribute
Sub SetInputName(varInputName As String) As VMAutoComplete
	SetAttr(CreateMap("md-input-name": varInputName))
	Return Me
End Sub

'The input id attribute
Sub SetInputId(varInputId As String) As VMAutoComplete
	SetAttr(CreateMap("md-input-id": varInputId))
	Return Me
End Sub

'Eables a character count, based on the given value
Sub SetInputMaxLength(varInputMaxLength As Int) As VMAutoComplete
	SetAttr(CreateMap("md-input-max-length": varInputMaxLength))
	Return Me
End Sub

'Sets a optional placeholder on autocomplete.
Sub SetInputPlaceholder(varInputPlaceholder As Object) As VMAutoComplete
	SetAttr(CreateMap("md-input-placeholder": varInputPlaceholder))
	Return Me
End Sub

'Enable the dense layout For options
Sub SetDense(varDense As Boolean) As VMAutoComplete
	SetAttr(CreateMap(":md-dense": varDense))
	Return Me
End Sub

'Sets the input layout. The floating variant Is the default.
Sub SetLayout(varLayout As Object) As VMAutoComplete
	SetAttr(CreateMap("md-layout": varLayout))
	Return Me
End Sub

'Sets the input layout. The floating variant Is the default.-floating
Sub SetLayoutFloating(b As Boolean) As VMAutoComplete    'ignore
	SetAttr(CreateMap("md-layout": "floating"))
	Return Me
End Sub

'Sets the input layout. The floating variant Is the default.-box
Sub SetLayoutBox(b As Boolean) As VMAutoComplete    'ignore
	SetAttr(CreateMap("md-layout": "box"))
	Return Me
End Sub

'Disable/enable the on focus event.
Sub SetOpenOnFocus(varOpenOnFocus As Boolean) As VMAutoComplete
	SetAttr(CreateMap(":md-open-on-focus": varOpenOnFocus))
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As String) As VMAutoComplete
	varName = varName.tolowercase
	AutoComplete.SetName(varName, False)
	Return Me
End Sub

'The input required. Similar To HTML5 required attribute.
Sub SetRequired(varRequired As Boolean) As VMAutoComplete
	AutoComplete.SetRequired(varRequired)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMAutoComplete
	AutoComplete.SetDisabled(b)
	Return Me
End Sub

'Triggered when the user types on the input field	The search term
private Sub SetOnChanged(searchTerm As Object) As VMAutoComplete
	Dim methodName As String = $"${ID}_changed"$ 
	If SubExists(module, methodName) = False Then Return Me
	Dim searchTerm As Object
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(searchTerm))
	SetAttr(CreateMap("v-on:md-changed": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'Triggered when the user selects an option
private Sub SetOnSelected As VMAutoComplete
	Dim methodName As String = $"${ID}_selected"$
	If SubExists(module, methodName) = False Then Return Me
	Dim sval As Object
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(sval))
	SetAttr(CreateMap("v-on:md-selected": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'Triggered when the options panel Is opened
private Sub SetOnOpened As VMAutoComplete
	Dim methodName As String = $"${ID}_opened"$
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	SetAttr(CreateMap("v-on:md-opened": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'Triggered when the options panel Is closed
private Sub SetOnClosed As VMAutoComplete
	Dim methodName As String = $"${ID}_opened"$
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
	SetAttr(CreateMap("v-on:md-closed": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub