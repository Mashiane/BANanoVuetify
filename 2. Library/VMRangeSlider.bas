B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
'https://nightcatsama.github.io/vue-slider-component
Sub Class_Globals
	Public RangeSlider As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private InputInt As VMElement
	Private lbl As VMLabel
	Private vmodelText As String
	Private labelOnTop As Boolean
	Private module As Object
	Private DesignMode As Boolean
	Private showLabel As Boolean
	Private BANano As BANano  'ignore
End Sub

#if css
	.vue-slider-dot-tooltip-inner { background-color: #3498db !important; }
	.vue-slider-dot-handle::after { background-color: rgba(52, 152, 219, 0.36) !important; }
	.vue-slider-dot-handle { background-color: #3498db !important; }
	.vue-slider-mark-step { background-color: #3498db !important; }
	.vue-slider-process { background-color: #3498db !important; }
	.vue-slider-rail { background-color: #ccc !important; }
	.vue-slider-mark-step-active { background-color: #bda1f3 !important; }
#End If

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMRangeSlider
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	RangeSlider.Initialize(vue, ID).SetTag("vue-slider")
	InputInt.Initialize(v,$"${ID}field"$).SetTag("div")
	lbl.Initialize(vue, $"${ID}label"$)
	labelOnTop = True
	DesignMode = False
	showLabel = False
	SetVModel(ID)
	SetLazy(True)		' only update when the drag is over.
	SetEnableCross(False)
	SetOnFocus
	SetOnBlur
	Return Me
End Sub


private Sub SetOnFocus As VMRangeSlider
	Dim oninput As String = $"${ID}_focus"$
	If SubExists(module, oninput) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, oninput, Array(e))
	SetAttr(CreateMap("@focus":oninput))
	vue.SetCallBack(oninput, cb)
	Return Me
End Sub

private Sub SetOnBlur As VMRangeSlider
	Dim oninput As String = $"${ID}_blur"$
	If SubExists(module, oninput) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, oninput, Array(e))
	SetAttr(CreateMap("@blur":oninput))
	vue.SetCallBack(oninput, cb)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMRangeSlider
	RangeSlider.RemoveAttr(sName)
	Return Me
End Sub

Sub SetDotSize(dotSize As Int) As VMRangeSlider
	Dim pp As String = $"${ID}dotsize"$
	vue.SetStateSingle(pp, dotSize)
	RangeSlider.SetAttrSingle(":dotSize", pp)
	Return Me
End Sub

Sub SetWidth(width As String) As VMRangeSlider
	Dim pp As String = $"${ID}width"$
	vue.SetStateSingle(pp, width)
	RangeSlider.SetAttrSingle(":width", pp)
	Return Me
End Sub


Sub SetSilent(silent As Boolean) As VMRangeSlider
	Dim pp As String = $"${ID}silent"$
	vue.SetStateSingle(pp, silent)
	RangeSlider.SetAttrSingle(":silent", pp)
	Return Me
End Sub


Sub SetFixed(fixed As Boolean) As VMRangeSlider
	Dim pp As String = $"${ID}fixed"$
	vue.SetStateSingle(pp, fixed)
	RangeSlider.SetAttrSingle(":fixed", pp)
	Return Me
End Sub

Sub SetDragOnClick(dragOnClick As Boolean) As VMRangeSlider
	Dim pp As String = $"${ID}dragonclick"$
	vue.SetStateSingle(pp, dragOnClick)
	RangeSlider.SetAttrSingle(":dragOnClick", pp)
	Return Me
End Sub


Sub SetAdSorb(adsorb As Boolean) As VMRangeSlider
	Dim pp As String = $"${ID}adsorb"$
	vue.SetStateSingle(pp, adsorb)
	RangeSlider.SetAttrSingle(":adsorb", pp)
	Return Me
End Sub


Sub SetLazy(lazy As Boolean) As VMRangeSlider
	Dim pp As String = $"${ID}lazy"$
	vue.SetStateSingle(pp, lazy)
	RangeSlider.SetAttrSingle(":lazy", pp)
	Return Me
End Sub

'enable values to cross for the range
Sub SetEnableCross(enableCross As Boolean) As VMRangeSlider
	Dim pp As String = $"${ID}enableCross"$
	vue.SetStateSingle(pp, enableCross)
	RangeSlider.Bind(":enable-cross", pp)
	Return Me
End Sub

Sub SetTooltip(tooltip As String) As VMRangeSlider
	Dim pp As String = $"${ID}tooltip"$
	vue.SetStateSingle(pp, tooltip)
	RangeSlider.SetAttrSingle(":tooltip", pp)
	Return Me
End Sub

Sub SetTooltipPlacement(tooltipPlacement As String) As VMRangeSlider
	Dim pp As String = $"${ID}tooltipplacement"$
	vue.SetStateSingle(pp, tooltipPlacement)
	RangeSlider.SetAttrSingle(":tooltipPlacement", pp)
	Return Me
End Sub

Sub SetTooltipFormatter(tooltipFormatter As Object) As VMRangeSlider
	Dim pp As String = $"${ID}tooltipFormatter"$
	vue.SetStateSingle(pp, tooltipFormatter)
	RangeSlider.Bind(":tooltip-formatter", pp)
	Return Me
End Sub


Sub SetMinRange(minRange As Object) As VMRangeSlider
	Dim pp As String = $"${ID}minRange"$
	vue.SetStateSingle(pp, minRange)
	RangeSlider.Bind(":min-range", pp)
	Return Me
End Sub

Sub SetMaxRange(maxRange As Object) As VMRangeSlider
	Dim pp As String = $"${ID}maxRange"$
	vue.SetStateSingle(pp, maxRange)
	RangeSlider.Bind(":max-range", pp)
	Return Me
End Sub

Sub SetTooltipPlacementTop As VMRangeSlider
	SetTooltipPlacement("top")
	Return Me
End Sub

Sub SetTooltipPlacementBottom As VMRangeSlider
	SetTooltipPlacement("bottom")
	Return Me
End Sub

Sub SetTooltipPlacementRight As VMRangeSlider
	SetTooltipPlacement("right")
	Return Me
End Sub

Sub SetTooltipPlacementLeft As VMRangeSlider
	SetTooltipPlacement("left")
	Return Me
End Sub


Sub SetTooltipNone As VMRangeSlider
	SetTooltip("none")
	Return Me
End Sub

Sub SetTooltipHover As VMRangeSlider
	SetTooltip("hover")
	Return Me
End Sub

Sub SetTooltipFocus As VMRangeSlider
	SetTooltip("focus")
	Return Me
End Sub

Sub SetTooltipActive As VMRangeSlider
	SetTooltip("active")
	Return Me
End Sub

Sub SetTooltipAlways As VMRangeSlider
	SetTooltip("always")
	Return Me
End Sub


Sub SetContained(contained As Boolean) As VMRangeSlider
	Dim pp As String = $"${ID}contained"$
	vue.SetStateSingle(pp, contained)
	RangeSlider.SetAttrSingle(":contained", pp)
	Return Me
End Sub

'hide label markers
Sub SetHideLabel(hideLabel As Boolean) As VMRangeSlider
	Dim pp As String = $"${ID}hideLabel"$
	vue.SetStateSingle(pp, hideLabel)
	RangeSlider.Bind(":hideLabel", pp)
	Return Me
End Sub


Sub SetProcess(process As Boolean) As VMRangeSlider
	Dim pp As String = $"${ID}process"$
	vue.SetStateSingle(pp, process)
	RangeSlider.Bind(":process", pp)
	Return Me
End Sub


'
Sub SetIncluded(included As Boolean) As VMRangeSlider
	Dim pp As String = $"${ID}included"$
	vue.SetStateSingle(pp, included)
	RangeSlider.Bind(":included", pp)
	Return Me
End Sub

Sub SetData(data As Object) As VMRangeSlider
	Dim pp As String = $"${ID}data"$
	vue.SetStateSingle(pp, data)
	RangeSlider.SetAttrSingle(":data", pp)
	Return Me
End Sub


Sub SetMarks(data As Object) As VMRangeSlider
	Dim pp As String = $"${ID}marks"$
	vue.SetStateSingle(pp, data)
	RangeSlider.SetAttrSingle(":marks", pp)
	Return Me
End Sub


Sub SetShowMarks As VMRangeSlider
	Dim pp As String = $"${ID}marks"$
	vue.SetStateSingle(pp, True)
	RangeSlider.SetAttrSingle(":marks", pp)
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

Sub SetDirection(direction As String) As VMRangeSlider
	Dim pp As String = $"${ID}direction"$
	vue.SetStateSingle(pp, direction)
	RangeSlider.SetAttrSingle(":direction", pp)
	Return Me
End Sub

Sub SetDirectionLTR As VMRangeSlider
	SetDirection("ltr")
	Return Me
End Sub

Sub SetDirectionBTT As VMRangeSlider
	SetDirection("btt")
	Return Me
End Sub

Sub SetDirectionTTB As VMRangeSlider
	SetDirection("ttb")
	Return Me
End Sub

Sub SetDirectionRTL As VMRangeSlider
	SetDirection("rtl")
	Return Me
End Sub

Sub SetShowLabel(b As Boolean) As VMRangeSlider
	showLabel = b
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

Sub SetLabelOnTop(b As Boolean) As VMRangeSlider
	labelOnTop = b
	Return Me
End Sub

Sub SetLabel(lblText As String) As VMRangeSlider
	lbl.SetText(lblText)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bind As Boolean) As VMRangeSlider
	RangeSlider.SetName(varName, bind)
	Return Me
End Sub

Sub SetMin(minv As Object) As VMRangeSlider
	Dim pp As String = $"${ID}min"$
	vue.SetStateSingle(pp, minv)
	RangeSlider.SetAttrSingle(":min", pp)
	Return Me
End Sub


Sub SetMax(maxv As Object) As VMRangeSlider
	Dim pp As String = $"${ID}max"$
	vue.SetStateSingle(pp, maxv)
	RangeSlider.SetAttrSingle(":max", pp)
	Return Me
End Sub


Sub SetInterval(interval As Object) As VMRangeSlider
	Dim pp As String = $"${ID}interval"$
	vue.SetStateSingle(pp, interval)
	RangeSlider.SetAttrSingle(":interval", pp)
	Return Me
End Sub


Sub SetDisabled(b As Boolean) As VMRangeSlider
	RangeSlider.SetDisabled(b)
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

Sub SetValue(v As Object) As VMRangeSlider
	vue.SetStateSingle(vmodelText, v)
	Return Me
End Sub

'set a range of values
Sub SetValueMulti(startv As Object, endv As Object) As VMRangeSlider
	Dim vals As List
	vals.Initialize
	vals.Add(startv)
	vals.Add(endv)
	SetValue(vals)
	Return Me
End Sub

private Sub SetVModel(k As String) As VMRangeSlider
	RangeSlider.SetVModel(k)
	vmodelText = k
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMRangeSlider
	RangeSlider.AddClass(c)
	Return Me
End Sub


Sub SetStyle(m As Map) As VMRangeSlider
	InputInt.SetStyle(m)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMRangeSlider
	RangeSlider.SetAttr(attr)
	Return Me
End Sub

Sub ToString As String
	lbl.SetDesignMode(DesignMode)
	InputInt.SetDesignMode(DesignMode)
	If labelOnTop Then InputInt.AddClass("dontwrap")
	If showLabel Then lbl.Pop(InputInt)
	RangeSlider.Pop(InputInt)
	Return InputInt.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

'set color intensity
Sub SetTextColor(varColor As String) As VMRangeSlider
	Dim sColor As String = $"${varColor}--text"$
	AddClass(sColor)
	Return Me
End Sub

'set color intensity
Sub SetTextColorIntensity(varColor As String, varIntensity As String) As VMRangeSlider
	Dim sColor As String = $"${varColor}--text"$
	Dim sIntensity As String = $"text--${varIntensity}"$
	Dim mcolor As String = $"${sColor} ${sIntensity}"$
	AddClass(mcolor)
	Return Me
End Sub