B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public RangeSlider As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private xmodel As String
End Sub

'initialize the RangeSlider
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMRangeSlider
	ID = sid.tolowercase
	RangeSlider.Initialize(v, ID)
	RangeSlider.SetTag("v-range-slider")
	DesignMode = False
	Module = eventHandler
	vue = v
	xmodel = ""
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMRangeSlider
	RangeSlider.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMRangeSlider
	RangeSlider.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMRangeSlider
	RangeSlider.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMRangeSlider
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMRangeSlider
	RangeSlider.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMRangeSlider
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub SetRange(iStart As Int, iEnd As Int) As VMRangeSlider
	If xmodel = "" Then
		Log($"VMRangeSlier.SetRange - you need to set the v-model for '${ID}'"$)
	End If
	Dim lValue As List
	lValue.Initialize 
	lValue.Add(iStart)
	lValue.Add(iEnd)
	vue.SetStateList(xmodel, lValue)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMRangeSlider
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMRangeSlider
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	RangeSlider.Bind(":color", pp)
	Return Me
End Sub


'set required
Sub SetRequired(varRequired As Boolean) As VMRangeSlider
	RangeSlider.SetRequired(varRequired)
	Return Me
End Sub


'get component
Sub ToString As String
	Return RangeSlider.ToString
End Sub

Sub SetVModel(k As String) As VMRangeSlider
	k = k.ToLowerCase
	xmodel = k
	vue.SetStateSingle(k, 0)
	RangeSlider.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMRangeSlider
	RangeSlider.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMRangeSlider
	RangeSlider.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMRangeSlider
	Dim childHTML As String = child.ToString
	RangeSlider.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMRangeSlider
	RangeSlider.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMRangeSlider
	RangeSlider.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMRangeSlider
	RangeSlider.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMRangeSlider
	RangeSlider.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set append-icon
Sub SetAppendIcon(varAppendIcon As Object) As VMRangeSlider
	Dim pp As String = $"${ID}AppendIcon"$
	vue.SetStateSingle(pp, varAppendIcon)
	RangeSlider.Bind(":append-icon", pp)
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As Object) As VMRangeSlider
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	RangeSlider.Bind(":background-color", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As Object) As VMRangeSlider
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	RangeSlider.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Object) As VMRangeSlider
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	RangeSlider.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Object) As VMRangeSlider
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	RangeSlider.Bind(":dense", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As boolean) As VMRangeSlider
	RangeSlider.SetDisabled(varDisabled)
	Return Me
End Sub

'set error
Sub SetError(varError As Object) As VMRangeSlider
	Dim pp As String = $"${ID}Error"$
	vue.SetStateSingle(pp, varError)
	RangeSlider.Bind(":error", pp)
	Return Me
End Sub

'set error-count
Sub SetErrorCount(varErrorCount As Object) As VMRangeSlider
	Dim pp As String = $"${ID}ErrorCount"$
	vue.SetStateSingle(pp, varErrorCount)
	RangeSlider.Bind(":error-count", pp)
	Return Me
End Sub

'set error-messages
Sub SetErrorMessages(varErrorMessages As Object) As VMRangeSlider
	Dim pp As String = $"${ID}ErrorMessages"$
	vue.SetStateSingle(pp, varErrorMessages)
	RangeSlider.Bind(":error-messages", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As Object) As VMRangeSlider
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	RangeSlider.Bind(":height", pp)
	Return Me
End Sub

'set hide-details
Sub SetHideDetails(varHideDetails As Object) As VMRangeSlider
	Dim pp As String = $"${ID}HideDetails"$
	vue.SetStateSingle(pp, varHideDetails)
	RangeSlider.Bind(":hide-details", pp)
	Return Me
End Sub

'set hint
Sub SetHint(varHint As Object) As VMRangeSlider
	Dim pp As String = $"${ID}Hint"$
	vue.SetStateSingle(pp, varHint)
	RangeSlider.Bind(":hint", pp)
	Return Me
End Sub

'set id
Sub SetId(varId As Object) As VMRangeSlider
	Dim pp As String = $"${ID}Id"$
	vue.SetStateSingle(pp, varId)
	RangeSlider.Bind(":id", pp)
	Return Me
End Sub

'set inverse-label
Sub SetInverseLabel(varInverseLabel As Object) As VMRangeSlider
	Dim pp As String = $"${ID}InverseLabel"$
	vue.SetStateSingle(pp, varInverseLabel)
	RangeSlider.Bind(":inverse-label", pp)
	Return Me
End Sub

'set label
Sub SetLabel(varLabel As Object) As VMRangeSlider
	Dim pp As String = $"${ID}Label"$
	vue.SetStateSingle(pp, varLabel)
	RangeSlider.Bind(":label", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Object) As VMRangeSlider
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	RangeSlider.Bind(":light", pp)
	Return Me
End Sub

'set loader-height
Sub SetLoaderHeight(varLoaderHeight As Object) As VMRangeSlider
	Dim pp As String = $"${ID}LoaderHeight"$
	vue.SetStateSingle(pp, varLoaderHeight)
	RangeSlider.Bind(":loader-height", pp)
	Return Me
End Sub

'set loading
Sub SetLoading(varLoading As Object) As VMRangeSlider
	Dim pp As String = $"${ID}Loading"$
	vue.SetStateSingle(pp, varLoading)
	RangeSlider.Bind(":loading", pp)
	Return Me
End Sub

'set max
Sub SetMax(varMax As Object) As VMRangeSlider
	Dim pp As String = $"${ID}Max"$
	vue.SetStateSingle(pp, varMax)
	RangeSlider.Bind(":max", pp)
	Return Me
End Sub

'set messages
Sub SetMessages(varMessages As Object) As VMRangeSlider
	Dim pp As String = $"${ID}Messages"$
	vue.SetStateSingle(pp, varMessages)
	RangeSlider.Bind(":messages", pp)
	Return Me
End Sub

'set min
Sub SetMin(varMin As Object) As VMRangeSlider
	Dim pp As String = $"${ID}Min"$
	vue.SetStateSingle(pp, varMin)
	RangeSlider.Bind(":min", pp)
	Return Me
End Sub

'set persistent-hint
Sub SetPersistentHint(varPersistentHint As Object) As VMRangeSlider
	Dim pp As String = $"${ID}PersistentHint"$
	vue.SetStateSingle(pp, varPersistentHint)
	RangeSlider.Bind(":persistent-hint", pp)
	Return Me
End Sub

'set prepend-icon
Sub SetPrependIcon(varPrependIcon As Object) As VMRangeSlider
	Dim pp As String = $"${ID}PrependIcon"$
	vue.SetStateSingle(pp, varPrependIcon)
	RangeSlider.Bind(":prepend-icon", pp)
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Object) As VMRangeSlider
	Dim pp As String = $"${ID}Readonly"$
	vue.SetStateSingle(pp, varReadonly)
	RangeSlider.Bind(":readonly", pp)
	Return Me
End Sub

'set rules
Sub SetRules(varRules As Object) As VMRangeSlider
	Dim pp As String = $"${ID}Rules"$
	vue.SetStateSingle(pp, varRules)
	RangeSlider.Bind(":rules", pp)
	Return Me
End Sub

'set step
Sub SetStep(varStep As Object) As VMRangeSlider
	Dim pp As String = $"${ID}Step"$
	vue.SetStateSingle(pp, varStep)
	RangeSlider.Bind(":step", pp)
	Return Me
End Sub

'set success
Sub SetSuccess(varSuccess As Object) As VMRangeSlider
	Dim pp As String = $"${ID}Success"$
	vue.SetStateSingle(pp, varSuccess)
	RangeSlider.Bind(":success", pp)
	Return Me
End Sub

'set success-messages
Sub SetSuccessMessages(varSuccessMessages As Object) As VMRangeSlider
	Dim pp As String = $"${ID}SuccessMessages"$
	vue.SetStateSingle(pp, varSuccessMessages)
	RangeSlider.Bind(":success-messages", pp)
	Return Me
End Sub

'set thumb-color
Sub SetThumbColor(varThumbColor As Object) As VMRangeSlider
	Dim pp As String = $"${ID}ThumbColor"$
	vue.SetStateSingle(pp, varThumbColor)
	RangeSlider.Bind(":thumb-color", pp)
	Return Me
End Sub

'set thumb-label
Sub SetThumbLabel(varThumbLabel As Object) As VMRangeSlider
	Dim pp As String = $"${ID}ThumbLabel"$
	vue.SetStateSingle(pp, varThumbLabel)
	RangeSlider.Bind(":thumb-label", pp)
	Return Me
End Sub

'set thumb-size
Sub SetThumbSize(varThumbSize As Object) As VMRangeSlider
	Dim pp As String = $"${ID}ThumbSize"$
	vue.SetStateSingle(pp, varThumbSize)
	RangeSlider.Bind(":thumb-size", pp)
	Return Me
End Sub

'set tick-labels
Sub SetTickLabels(varTickLabels As String) As VMRangeSlider
	varTickLabels = varTickLabels.tolowercase
	RangeSlider.SetAttrSingle(":tick-labels", varTickLabels)
	Return Me
End Sub

'set tick-size
Sub SetTickSize(varTickSize As Object) As VMRangeSlider
	Dim pp As String = $"${ID}TickSize"$
	vue.SetStateSingle(pp, varTickSize)
	RangeSlider.Bind(":tick-size", pp)
	Return Me
End Sub

'set ticks
Sub SetTicks(varTicks As Object) As VMRangeSlider
	Dim pp As String = $"${ID}Ticks"$
	vue.SetStateSingle(pp, varTicks)
	RangeSlider.Bind(":ticks", pp)
	Return Me
End Sub

'set track-color
Sub SetTrackColor(varTrackColor As Object) As VMRangeSlider
	Dim pp As String = $"${ID}TrackColor"$
	vue.SetStateSingle(pp, varTrackColor)
	RangeSlider.Bind(":track-color", pp)
	Return Me
End Sub

'set track-fill-color
Sub SetTrackFillColor(varTrackFillColor As Object) As VMRangeSlider
	Dim pp As String = $"${ID}TrackFillColor"$
	vue.SetStateSingle(pp, varTrackFillColor)
	RangeSlider.Bind(":track-fill-color", pp)
	Return Me
End Sub

'set validate-on-blur
Sub SetValidateOnBlur(varValidateOnBlur As Object) As VMRangeSlider
	Dim pp As String = $"${ID}ValidateOnBlur"$
	vue.SetStateSingle(pp, varValidateOnBlur)
	RangeSlider.Bind(":validate-on-blur", pp)
	Return Me
End Sub

'set value
Sub SetValue(varValue As Object) As VMRangeSlider
	Dim pp As String = $"${ID}Value"$
	vue.SetStateSingle(pp, varValue)
	RangeSlider.Bind(":value", pp)
	Return Me
End Sub

'set vertical
Sub SetVertical(varVertical As Object) As VMRangeSlider
	Dim pp As String = $"${ID}Vertical"$
	vue.SetStateSingle(pp, varVertical)
	RangeSlider.Bind(":vertical", pp)
	Return Me
End Sub

'
Sub SetSlotAppend(b As Boolean) As VMRangeSlider    'ignore
	SetAttr(CreateMap("slot": "append"))
	Return Me
End Sub

'
Sub SetSlotMessage(b As Boolean) As VMRangeSlider    'ignore
	SetAttr(CreateMap("slot": "message"))
	Return Me
End Sub

'
Sub SetSlotPrepend(b As Boolean) As VMRangeSlider    'ignore
	SetAttr(CreateMap("slot": "prepend"))
	Return Me
End Sub

'
Sub SetSlotProgress(b As Boolean) As VMRangeSlider    'ignore
	SetAttr(CreateMap("slot": "progress"))
	Return Me
End Sub

'
Sub SetSlotThumbLabel(b As Boolean) As VMRangeSlider    'ignore
	SetAttr(CreateMap("slot": "thumb-label"))
	Return Me
End Sub

'
Sub SetOnClick(methodName As String) As VMRangeSlider
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickAppend(methodName As String) As VMRangeSlider
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click:append": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickPrepend(methodName As String) As VMRangeSlider
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:click:prepend": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnEnd(methodName As String) As VMRangeSlider
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:end": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMousedown(methodName As String) As VMRangeSlider
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:mousedown": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMouseup(methodName As String) As VMRangeSlider
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:mouseup": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnStart(methodName As String) As VMRangeSlider
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:start": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateError(methodName As String) As VMRangeSlider
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, e)
	SetAttr(CreateMap("v-on:update:error": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMRangeSlider
	RangeSlider.SetVisible(False)
	Return Me
End Sub

Sub Show As VMRangeSlider
	RangeSlider.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMRangeSlider
	RangeSlider.Enable(True)
	Return Me
End Sub

Sub Disable As VMRangeSlider
	RangeSlider.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMRangeSlider
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMRangeSlider
	RangeSlider.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMRangeSlider
	RangeSlider.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMRangeSlider
	RangeSlider.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMRangeSlider
	RangeSlider.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMRangeSlider
	RangeSlider.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMRangeSlider
	RangeSlider.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMRangeSlider
	RangeSlider.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMRangeSlider
	RangeSlider.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub


Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMRangeSlider
RangeSlider.BuildModel(mprops, mstyles, lclasses, loose)
Return Me
End Sub
Sub SetVisible(b As Boolean) As VMRangeSlider
RangeSlider.SetVisible(b)
Return Me
End Sub