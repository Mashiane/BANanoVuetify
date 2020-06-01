B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public InfoBox As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private Icon As VMElement
	Private Content As VMElement
	Private Text As VMElement
	Public CountIt As VMCountTo
	Private i As VMElement
	Private hasIcon As Boolean
	Private banano As BANano   'ignore
	Private module As Object
	Private banano As BANano
	Private bStatic As Boolean
	Private DesignMode As Boolean
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMInfoBox
	banano.DependsOnAsset("info-box.min.css")
	banano.DependsOnAsset("vue-count-to.min.js")
	banano.DependsOnAsset("helpers.min.css")
	bStatic = False
	DesignMode = False
	'
	module = eventHandler
	ID = sid.ToLowerCase
	vue = v
	InfoBox.Initialize(vue, ID).SetTag("div").AddClass("info-box")
	Icon.Initialize(vue, $"${ID}icn"$).SetTag("div").AddClass("icon")
	Content.Initialize(vue,$"${ID}content"$).SetTag("div").AddClass("content")
	Text.Initialize(vue,$"${ID}text"$).SetTag("div").AddClass("text") 
	'
	CountIt.Initialize(vue, $"${ID}number"$, module).AddClass("number")
	CountIt.CountTo.SetRef($"${ID}number"$)
	i.Initialize(vue,$"${ID}i"$).SetTag("i").AddClass("material-icons")
	hasIcon = False
	InfoBox.SetOnClick(module, $"${ID}_click"$)
	SetKey(ID)
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMInfoBox
	bStatic = b
	Content.setstatic(b)
	InfoBox.SetStatic(b)
	Icon.SetStatic(b)
	Text.SetStatic(b)
	CountIt.SetStatic(b)
	i.SetStatic(b)
	Return Me
End Sub


Sub NewInfoBox(sText As String, sIcon As String, sIconBackgroundColor As String, iStart As String, iFinish As String) As VMInfoBox
	InfoBox.typeof = "infobox"
	InfoBox.fieldType = "string"
	If iStart <> Null Then SetFrom(iStart)
	If iFinish <> Null Then SetTo(iFinish)
	If sIcon <> Null Then SetIcon(sIcon)
	If sIconBackgroundColor <> Null Then SetIconBackgroundColor(sIconBackgroundColor)
	SetText(sText)
	If iFinish <> Null Then CountIt.SetText(iFinish)
	SetDuration("1000")
	Return Me
End Sub

Sub Start
	Dim bo As BANanoObject = vue.refs.Getfield($"${ID}number"$)
	bo.RunMethod("start", Null)
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMInfoBox
	InfoBox.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMInfoBox
	InfoBox.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMInfoBox
	InfoBox.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMInfoBox
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub SetID(iID As String, bind As Boolean) As VMInfoBox
	InfoBox.SetID(iID,bind)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMInfoBox
	InfoBox.RemoveAttr(sName)
	Return Me
End Sub


Sub SetDesignMode(b As Boolean) As VMInfoBox
	DesignMode = b
	InfoBox.SetDesignMode(b)
	Content.SetDesignMode(b)
	Icon.SetDesignMode(b)
	Text.SetDesignMode(b)
	i.SetDesignMode(b)
	CountIt.SetDesignMode(b)
	Return Me
End Sub

Sub SetKey(k As Object) As VMInfoBox
	Dim pp As String = $"${ID}key"$
	vue.SetStateSingle(pp, k)
	InfoBox.SetKey(pp,True)
	Return Me
End Sub

Sub SetStyle2(b As Boolean) As VMInfoBox
	If b = False Then Return Me
	InfoBox.removeclass("info-box").addclass("info-box-2")
	Return Me
End Sub

Sub SetStyle3(b As Boolean) As VMInfoBox
	If b = False Then Return Me
	InfoBox.removeclass("info-box").addclass("info-box-3")
	Return Me
End Sub

Sub SetStyle4(b As Boolean) As VMInfoBox
	If b = False Then Return Me
	InfoBox.removeclass("info-box").addclass("info-box-4")
	Return Me
End Sub

Sub SetIconBackgroundColor(background As String) As VMInfoBox
	If background = "" Then Return Me
	Dim bg As String = $"bg-${background}"$
	Icon.AddClass(bg)
	Return Me
End Sub

Sub SetBackgroundColor(background As String) As VMInfoBox
	If background = "" Then Return Me
	Dim bg As String = $"bg-${background}"$
	InfoBox.AddClass(bg)
	Return Me
End Sub

Sub SetIconColor(foreColor As String) As VMInfoBox
	If foreColor = "" Then Return Me
	Dim bg As String = $"col-${foreColor}"$
	I.AddClass(bg)
	Return Me
End Sub

Sub SetColor(foreColor As String) As VMInfoBox
	Dim bg As String = $"col-${foreColor}"$
	InfoBox.AddClass(bg)
	Return Me
End Sub

Sub SetText(txt As String) As VMInfoBox
	If bStatic Then
		Text.SetText(txt)
		Return Me
	End If
	Dim pp As String = $"${ID}text"$
	vue.SetStateSingle(pp, txt)
	Text.SetText($"{{ ${pp} }}"$)
	Return Me
End Sub

Sub SetFrom(startFrom As String) As VMInfoBox
	CountIt.SetStartVal(startFrom)
	Return Me
End Sub

Sub SetTo(endTo As String) As VMInfoBox
	CountIt.SetEndval(endTo)
	CountIt.SetText(endTo)
	Return Me
End Sub

Sub SetDuration(speed As String) As VMInfoBox
	speed = banano.parseInt(speed)
	CountIt.SetDuration(speed)
	Return Me
End Sub

Sub SetAutoplay(varAutoplay As Boolean) As VMInfoBox
	CountIt.SetAutoPlay(varAutoplay)
	Return Me
End Sub

Sub SetDecimals(varDecimals As String) As VMInfoBox
	CountIt.SetDecimals(varDecimals)
	Return Me
End Sub

Sub SetDecimal(varDecimal As String) As VMInfoBox
	CountIt.SetDecimal(varDecimal)
	Return Me
End Sub

Sub SetSeparator(varSeparator As String) As VMInfoBox
	CountIt.SetSeparator(varSeparator)
	Return Me
End Sub

Sub SetPrefix(varPrefix As String) As VMInfoBox
	CountIt.SetPrefix(varPrefix)
	Return Me
End Sub

Sub SetSuffix(varSuffix As String) As VMInfoBox
	CountIt.SetSuffix(varSuffix)
	Return Me
End Sub

Sub SetIcon(matIcon As String) As VMInfoBox
	If matIcon = "" Then Return Me
	hasIcon = True
	i.SetText(matIcon)
	Return Me
End Sub

Sub ToString As String	
	If hasIcon Then i.Pop(Icon)
	Icon.Pop(InfoBox)
	Text.Pop(Content)
	CountIt.Pop(Content)
	Content.Pop(InfoBox)
	Dim scode As String = InfoBox.ToString
	Return scode
End Sub

Sub SetHoverZoomEffect(b As Boolean) As VMInfoBox
	If b = False Then Return Me
	InfoBox.AddClass("hover-zoom-effect")
	Return Me
End Sub

Sub SetHoverExpandEffect(b As Boolean) As VMInfoBox
	If b = False Then Return Me
	InfoBox.AddClass("hover-expand-effect")
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMInfoBox
	InfoBox.SetStyle(sm)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMInfoBox
	InfoBox.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMInfoBox
	InfoBox.SetVShow(vif)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMInfoBox
	InfoBox.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMInfoBox
	InfoBox.SetAttr(attr)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMInfoBox
	InfoBox.SetDisabled(b)
	Return Me
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

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMInfoBox
	InfoBox.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMInfoBox
	InfoBox.SetVisible(b)
	Return Me
End Sub
