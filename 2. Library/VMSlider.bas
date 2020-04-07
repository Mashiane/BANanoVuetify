B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Slider As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Private xmodel As String = ""
	Private bStatic As Boolean
	Private bIsRange As Boolean
End Sub

'initialize the Slider
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSlider
	ID = sid.tolowercase
	Slider.Initialize(v, ID).SetTag("v-slider")
	DesignMode = False
	Module = eventHandler
	vue = v
	SetOnClickAppend($"${ID}_append"$)
	SetOnClickPrepend($"${ID}_prepend"$)
	xmodel = ""
	Slider.typeOf = "slide"
	bStatic = False
	bIsRange = False
	Return Me
End Sub

Sub SetRangeSlider(b As Boolean) As VMSlider
	If b = False Then Return Me
	Slider.SetTag("v-range-slider")
	bIsRange = True
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMSlider
	bStatic = b
	Slider.SetStatic(b)
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMSlider
	Slider.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMSlider
	Slider.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMSlider
	Slider.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMSlider
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMSlider
	Slider.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMSlider
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMSlider
	If themeName = "" Then Return Me
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub

Sub SetLabelOnRight(b As Boolean) As VMSlider
	If b = False Then Return Me
	SetInverseLabel(True)
	Return Me
End Sub


'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMSlider
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		SetAttrSingle("color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	Slider.Bind(":color", pp)
	Return Me
End Sub

'set required
Sub SetRequired(varRequired As Boolean) As VMSlider
	Slider.SetRequired(varRequired)
	Return Me
End Sub

'get component
Sub ToString As String
	Return Slider.ToString
End Sub

Sub SetVModel(k As String) As VMSlider
	xmodel = k.tolowercase
	vue.SetStateSingle(xmodel, 0)
	Slider.SetVModel(xmodel)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMSlider
	Slider.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMSlider
	Slider.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMSlider
	Dim childHTML As String = child.ToString
	Slider.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMSlider
	Slider.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMSlider
	Slider.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMSlider
	Slider.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMSlider
	Slider.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set append-icon
Sub SetAppendIcon(varAppendIcon As String) As VMSlider
	If varAppendIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("append-icon", varAppendIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}AppendIcon"$
	vue.SetStateSingle(pp, varAppendIcon)
	Slider.Bind(":append-icon", pp)
	Return Me
End Sub

'set background-color
Sub SetBackgroundColor(varBackgroundColor As String) As VMSlider
	If varBackgroundColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("background-color", varBackgroundColor)
		Return Me
	End If
	Dim pp As String = $"${ID}BackgroundColor"$
	vue.SetStateSingle(pp, varBackgroundColor)
	Slider.Bind(":background-color", pp)
	Return Me
End Sub

'set color
Sub SetColor(varColor As String) As VMSlider
	If varColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("color", varColor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Slider.Bind(":color", pp)
	Return Me
End Sub

'set dark
Sub SetDark(varDark As Boolean) As VMSlider
	If varDark = False Then Return Me
	If bStatic Then
		SetAttrSingle("dark", varDark)
		Return Me
	End If
	Dim pp As String = $"${ID}Dark"$
	vue.SetStateSingle(pp, varDark)
	Slider.Bind(":dark", pp)
	Return Me
End Sub

'set dense
Sub SetDense(varDense As Boolean) As VMSlider
	If varDense = False Then Return Me
	If bStatic Then
		SetAttrSingle("dense", varDense)
		Return Me
	End If
	Dim pp As String = $"${ID}Dense"$
	vue.SetStateSingle(pp, varDense)
	Slider.Bind(":dense", pp)
	Return Me
End Sub

'set disabled
Sub SetDisabled(varDisabled As Boolean) As VMSlider
	Slider.SetDisabled(varDisabled)
	Return Me
End Sub

'set error
Sub SetError(varError As Boolean) As VMSlider
	If varError = False Then Return Me
	If bStatic Then
		SetAttrSingle("error", varError)
		Return Me
	End If
	Dim pp As String = $"${ID}Error"$
	vue.SetStateSingle(pp, varError)
	Slider.Bind(":error", pp)
	Return Me
End Sub

'set error-count
Sub SetErrorCount(varErrorCount As Int) As VMSlider
	If bStatic Then
		SetAttrSingle("error-count", varErrorCount)
		Return Me
	End If
	Dim pp As String = $"${ID}ErrorCount"$
	vue.SetStateSingle(pp, varErrorCount)
	Slider.Bind(":error-count", pp)
	Return Me
End Sub

'set error-messages
Sub SetErrorMessages(varErrorMessages As Object) As VMSlider
	Dim pp As String = $"${ID}ErrorMessages"$
	vue.SetStateSingle(pp, varErrorMessages)
	Slider.Bind(":error-messages", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As String) As VMSlider
	If varHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("height", varHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	Slider.Bind(":height", pp)
	Return Me
End Sub

'set hide-details
Sub SetHideDetails(varHideDetails As Boolean) As VMSlider
	If varHideDetails = False Then Return Me
	If bStatic Then
		SetAttrSingle("hide-details", varHideDetails)
		Return Me
	End If
	Dim pp As String = $"${ID}HideDetails"$
	vue.SetStateSingle(pp, varHideDetails)
	Slider.Bind(":hide-details", pp)
	Return Me
End Sub

'set hint
Sub SetHint(varHint As String) As VMSlider
	If varHint = "" Then Return Me
	If bStatic Then
		SetAttrSingle("hint", varHint)
		Return Me
	End If
	Dim pp As String = $"${ID}Hint"$
	vue.SetStateSingle(pp, varHint)
	Slider.Bind(":hint", pp)
	Return Me
End Sub

'set id
Sub SetId(varId As String) As VMSlider
	Dim pp As String = $"${ID}Id"$
	vue.SetStateSingle(pp, varId)
	Slider.Bind(":id", pp)
	Return Me
End Sub

'set inverse-label
Sub SetInverseLabel(varInverseLabel As Boolean) As VMSlider
	If varInverseLabel = False Then Return Me
	If bStatic Then
		SetAttrSingle("inverse-label", varInverseLabel)
		Return Me
	End If
	Dim pp As String = $"${ID}InverseLabel"$
	vue.SetStateSingle(pp, varInverseLabel)
	Slider.Bind(":inverse-label", pp)
	Return Me
End Sub

'set label
Sub SetLabel(varLabel As String) As VMSlider
	If varLabel = "" Then Return Me
	If bStatic Then
		SetAttrSingle("label", varLabel)
		Return Me
	End If
	Dim pp As String = $"${ID}Label"$
	vue.SetStateSingle(pp, varLabel)
	Slider.Bind(":label", pp)
	Return Me
End Sub

'set light
Sub SetLight(varLight As Boolean) As VMSlider
	If varLight = False Then Return Me
	If bStatic Then
		SetAttrSingle("light", varLight)
		Return Me
	End If
	Dim pp As String = $"${ID}Light"$
	vue.SetStateSingle(pp, varLight)
	Slider.Bind(":light", pp)
	Return Me
End Sub

'set loader-height
Sub SetLoaderHeight(varLoaderHeight As String) As VMSlider
	If varLoaderHeight = "" Then Return Me
	If bStatic Then
		SetAttrSingle("loader-height", varLoaderHeight)
		Return Me
	End If
	Dim pp As String = $"${ID}LoaderHeight"$
	vue.SetStateSingle(pp, varLoaderHeight)
	Slider.Bind(":loader-height", pp)
	Return Me
End Sub

'set loading
Sub SetLoading(varLoading As Boolean) As VMSlider
	If varLoading = False Then Return Me
	If bStatic Then
		SetAttrSingle("loading", varLoading)
		Return Me
	End If
	Dim pp As String = $"${ID}Loading"$
	vue.SetStateSingle(pp, varLoading)
	Slider.Bind(":loading", pp)
	Return Me
End Sub

'set max
Sub SetMax(varMax As Double) As VMSlider
	varMax = BANano.parseFloat(varMax)
	If bStatic Then
		SetAttrSingle("max", varMax)
		Return Me
	End If
	Dim pp As String = $"${ID}Max"$
	vue.SetStateSingle(pp, varMax)
	Slider.Bind(":max", pp)
	Return Me
End Sub

'set messages
Sub SetMessages(varMessages As Object) As VMSlider
	Dim pp As String = $"${ID}Messages"$
	vue.SetStateSingle(pp, varMessages)
	Slider.Bind(":messages", pp)
	Return Me
End Sub

'set min
Sub SetMin(varMin As Double) As VMSlider
	varMin = BANano.parseFloat(varMin)
	If bStatic Then
		SetAttrSingle("min", varMin)
		Return Me
	End If
	Dim pp As String = $"${ID}Min"$
	vue.SetStateSingle(pp, varMin)
	Slider.Bind(":min", pp)
	Return Me
End Sub

'set persistent-hint
Sub SetPersistentHint(varPersistentHint As Boolean) As VMSlider
	If varPersistentHint = False Then Return Me
	If bStatic Then
		SetAttrSingle("persistent-hint", varPersistentHint)
		Return Me
	End If
	Dim pp As String = $"${ID}PersistentHint"$
	vue.SetStateSingle(pp, varPersistentHint)
	Slider.Bind(":persistent-hint", pp)
	Return Me
End Sub

'set prepend-icon
Sub SetPrependIcon(varPrependIcon As String) As VMSlider
	If varPrependIcon = "" Then Return Me
	If bStatic Then
		SetAttrSingle("prepend-icon", varPrependIcon)
		Return Me
	End If
	Dim pp As String = $"${ID}PrependIcon"$
	vue.SetStateSingle(pp, varPrependIcon)
	Slider.Bind(":prepend-icon", pp)
	Return Me
End Sub

'set readonly
Sub SetReadonly(varReadonly As Boolean) As VMSlider
	If varReadonly = False Then Return Me
	If bStatic Then
		SetAttrSingle("readonly", varReadonly)
		Return Me
	End If
	Dim pp As String = $"${ID}Readonly"$
	vue.SetStateSingle(pp, varReadonly)
	Slider.Bind(":readonly", pp)
	Return Me
End Sub

'set rules
Sub SetRules(varRules As Object) As VMSlider
	Dim pp As String = $"${ID}Rules"$
	vue.SetStateSingle(pp, varRules)
	Slider.Bind(":rules", pp)
	Return Me
End Sub

'set step
Sub SetStep(varStep As Double) As VMSlider
	varStep = BANano.parseFloat(varStep)
	If bStatic Then
		SetAttrSingle("step", varStep)
		Return Me
	End If
	Dim pp As String = $"${ID}Step"$
	vue.SetStateSingle(pp, varStep)
	Slider.Bind(":step", pp)
	Return Me
End Sub

'set success
Sub SetSuccess(varSuccess As Boolean) As VMSlider
	If varSuccess = False Then Return Me
	If bStatic Then
		SetAttrSingle("success", varSuccess)
		Return Me
	End If
	Dim pp As String = $"${ID}Success"$
	vue.SetStateSingle(pp, varSuccess)
	Slider.Bind(":success", pp)
	Return Me
End Sub

'set success-messages
Sub SetSuccessMessages(varSuccessMessages As Object) As VMSlider
	Dim pp As String = $"${ID}SuccessMessages"$
	vue.SetStateSingle(pp, varSuccessMessages)
	Slider.Bind(":success-messages", pp)
	Return Me
End Sub

'set thumb-color
Sub SetThumbColor(varThumbColor As String) As VMSlider
	If varThumbColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("thumb-color", varThumbColor)
		Return Me
	End If
	Dim pp As String = $"${ID}ThumbColor"$
	vue.SetStateSingle(pp, varThumbColor)
	Slider.Bind(":thumb-color", pp)
	Return Me
End Sub

'set color intensity
Sub SetThumbColorIntensity(varColor As String, varIntensity As String) As VMSlider
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		SetAttrSingle("thumb-color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	Slider.Bind(":thumb-color", pp)
	Return Me
End Sub

Sub SetThumbLabelAlways(b As Boolean) As VMSlider
	If b = False Then Return Me
	SetThumbLabel("always")
	Return Me
End Sub

'set thumb-label
Sub SetThumbLabel(varThumbLabel As String) As VMSlider
	If varThumbLabel = "" Then Return Me
	If bStatic Then
		SetAttrSingle("thumb-label", varThumbLabel)
		Return Me
	End If
	Dim pp As String = $"${ID}ThumbLabel"$
	vue.SetStateSingle(pp, varThumbLabel)
	Slider.Bind(":thumb-label", pp)
	Return Me
End Sub

'set thumb-size
Sub SetThumbSize(varThumbSize As Int) As VMSlider
	varThumbSize = BANano.parseInt(varThumbSize)
	If bStatic Then
		SetAttrSingle("thumb-size", varThumbSize)
		Return Me
	End If
	Dim pp As String = $"${ID}ThumbSize"$
	vue.SetStateSingle(pp, varThumbSize)
	Slider.Bind(":thumb-size", pp)
	Return Me
End Sub

'set tick-labels
Sub SetTickLabels(varTickLabels As List) As VMSlider
	If varTickLabels = Null Then Return Me
	Dim pp As String = $"${ID}TickLabels"$
	vue.SetData(pp, varTickLabels)
	Slider.Bind(":tick-labels", pp)
	Return Me
End Sub

'set tick-size
Sub SetTickSize(varTickSize As Int) As VMSlider
	varTickSize = BANano.parseInt(varTickSize)
	If bStatic Then
		SetAttrSingle("tick-size", varTickSize)
		Return Me
	End If
	Dim pp As String = $"${ID}TickSize"$
	vue.SetStateSingle(pp, varTickSize)
	Slider.Bind(":tick-size", pp)
	Return Me
End Sub

'set ticks
Sub SetTicks(varTicks As String) As VMSlider
	If varTicks = "" Then Return Me
	If bStatic Then
		SetAttrSingle("ticks", varTicks)
		Return Me
	End If
	Dim pp As String = $"${ID}Ticks"$
	vue.SetStateSingle(pp, varTicks)
	Slider.Bind(":ticks", pp)
	Return Me
End Sub

'set track-color
Sub SetTrackColor(varTrackColor As String) As VMSlider
	If varTrackColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("track-color", varTrackColor)
		Return Me
	End If
	Dim pp As String = $"${ID}TrackColor"$
	vue.SetStateSingle(pp, varTrackColor)
	Slider.Bind(":track-color", pp)
	Return Me
End Sub

'set color intensity
Sub SetTrackColorIntensity(varColor As String, varIntensity As String) As VMSlider
	If varColor = "" Then Return Me
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	If bStatic Then
		SetAttrSingle("track-color", scolor)
		Return Me
	End If
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	Slider.Bind(":track-color", pp)
	Return Me
End Sub


'set track-fill-color
Sub SetTrackFillColor(varTrackFillColor As String) As VMSlider
	If varTrackFillColor = "" Then Return Me
	If bStatic Then
		SetAttrSingle("track-fill-color", varTrackFillColor)
		Return Me
	End If
	Dim pp As String = $"${ID}TrackFillColor"$
	vue.SetStateSingle(pp, varTrackFillColor)
	Slider.Bind(":track-fill-color", pp)
	Return Me
End Sub

'set validate-on-blur
Sub SetValidateOnBlur(varValidateOnBlur As Boolean) As VMSlider
	If varValidateOnBlur = False Then Return Me
	If bStatic Then
		SetAttrSingle("validate-on-blur", varValidateOnBlur)
		Return Me
	End If
	Dim pp As String = $"${ID}ValidateOnBlur"$
	vue.SetStateSingle(pp, varValidateOnBlur)
	Slider.Bind(":validate-on-blur", pp)
	Return Me
End Sub

'set value, updated the vmodel
Sub SetValue(varValue As String) As VMSlider
	If xmodel = "" Then
		Log($"VMSlider.SetValue '${ID}' - please set the vmodel first!"$)
	End If
	If bIsRange Then
		Dim v1 As String = vue.MvField(varValue,1,",")
		Dim v2 As String = vue.MvField(varValue,2,",")
		'
		v1 = BANano.parseFloat(v1)
		v2 = BANano.parseFloat(v2)
		'
		Dim values As List
		values.Initialize 
		values.Add(v1)
		values.Add(v2)
		vue.SetData(xmodel, values)
		Return Me
	End If
	varValue = BANano.parseFloat(varValue)
	vue.SetData(xmodel, varValue)
	Return Me
End Sub

'set vertical
Sub SetVertical(varVertical As Boolean) As VMSlider
	If varVertical = False Then Return Me
	If bStatic Then
		SetAttrSingle("vertical", varVertical)
		Return Me
	End If
	Dim pp As String = $"${ID}Vertical"$
	vue.SetStateSingle(pp, varVertical)
	Slider.Bind(":vertical", pp)
	Return Me
End Sub

'
Sub SetSlotAppend(b As Boolean) As VMSlider    'ignore
	SetAttr(CreateMap("slot": "append"))
	Return Me
End Sub

'
Sub SetSlotMessage(b As Boolean) As VMSlider    'ignore
	SetAttr(CreateMap("slot": "message"))
	Return Me
End Sub

'
Sub SetSlotPrepend(b As Boolean) As VMSlider    'ignore
	SetAttr(CreateMap("slot": "prepend"))
	Return Me
End Sub

'
Sub SetSlotProgress(b As Boolean) As VMSlider    'ignore
	SetAttr(CreateMap("slot": "progress"))
	Return Me
End Sub

'
Sub SetSlotThumbLabel(b As Boolean) As VMSlider    'ignore
	SetAttr(CreateMap("slot": "thumb-label"))
	Return Me
End Sub

'
Sub SetOnClick(methodName As String) As VMSlider
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("v-on:click": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickAppend(methodName As String) As VMSlider
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttrSingle("@click:append", methodName)
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnClickPrepend(methodName As String) As VMSlider
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttrSingle("@click:prepend", methodName)
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnEnd(methodName As String) As VMSlider
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("v-on:end": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMousedown(methodName As String) As VMSlider
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("v-on:mousedown": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnMouseup(methodName As String) As VMSlider
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("v-on:mouseup": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnStart(methodName As String) As VMSlider
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("v-on:start": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'
Sub SetOnUpdateError(methodName As String) As VMSlider
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
	SetAttr(CreateMap("v-on:update:error": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub Hide As VMSlider
	Slider.SetVisible(False)
	Return Me
End Sub

Sub Show As VMSlider
	Slider.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMSlider
	Slider.Enable(True)
	Return Me
End Sub

Sub Disable As VMSlider
	Slider.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMSlider
	stateprop = stateprop.ToLowerCase
	SetAttrSingle(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMSlider
	Slider.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMSlider
	Slider.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMSlider
	Slider.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMSlider
	Slider.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMSlider
	Slider.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMSlider
	Slider.SetName(varName, bbind)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMSlider
	Slider.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMSlider
	Slider.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMSlider
	Slider.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMSlider
	Slider.SetVisible(b)
	Return Me
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMSlider
	If varColor = "" Then Return Me
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMSlider
	If varColor = "" Then Return Me
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub