B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Avatar As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private DesignMode As Boolean
	Private Module As Object
	Public Image As VMImage
	Public Icon As VMIcon
	Private hasIcon As Boolean
	Private hasImage As Boolean
End Sub

'initialize the Avatar
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMAvatar
	ID = sid.tolowercase
	Avatar.Initialize(v, ID)
	Avatar.SetTag("v-avatar")
	DesignMode = False
	Module = eventHandler
	vue = v
	Icon.Initialize(vue, $"${ID}icon"$, Module)
	Image.Initialize(vue, $"${ID}image"$, Module) 
	hasIcon = False
	hasImage = False
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMAvatar
	Avatar.SetRC(sRow, sCol)
	Return Me
End Sub

'set the offsets for this item
Sub SetDeviceOffsets(OS As String, OM As String,OL As String,OX As String) As VMAvatar
	Avatar.SetDeviceOffsets(OS, OM, OL, OX)
	Return Me
End Sub

'set the sizes for this item
Sub SetDeviceSizes(SS As String, SM As String, SL As String, SX As String) As VMAvatar
	Avatar.SetDeviceSizes(SS, SM, SL, SX)
	Return Me
End Sub

'set the position: row and column and sizes
Sub SetDevicePositions(srow As String, scell As String, small As String, medium As String, large As String, xlarge As String) As VMAvatar
	SetRC(srow, scell)
	SetDeviceSizes(small,medium, large, xlarge)
	Return Me
End Sub

Sub AddIcon(iID As String, iconName As String, props As Map,  classes As List,  attributes As List) As VMAvatar
	Dim vicon As VMIcon
	vicon.Initialize(vue, iID, Module).SetText(iconName)
	If attributes <> Null Then
		vicon.SetAttributes(attributes)
	End If
	If props <> Null Then
		For Each k As String In props.Keys
			 Dim v As String = props.Get(k)
		 	vicon.SetAttrSingle(k, v)
		Next
	End If
	If classes <> Null Then
		For Each c As String In classes
			vicon.AddClass(c)
		Next
	End If
	AddComponent(vicon.ToString)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMAvatar
	Avatar.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMAvatar
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub

Sub SetIcon(iconName As String, iconTheme As String, props As Map, classes As List, attributes As List) As VMAvatar
	hasIcon = True
	Icon.SetText(iconName)
	If iconTheme <> "" Then
		Icon.UseTheme(iconTheme)
	End If
	'
	If attributes <> Null Then
		Icon.SetAttributes(attributes)
	End If
	'
	If props <> Null Then
		For Each k As String In props.Keys
			Dim v As String = props.Get(k)
			Icon.SetAttrSingle(k, v)
		Next
	End If
	'
	If classes <> Null Then
		For Each c As String In classes
			Icon.AddClass(c)
		Next
	End If
	Return Me
End Sub

'set color intensity
Sub SetColorIntensity(varColor As String, varIntensity As String) As VMAvatar
	Dim pp As String = $"${ID}Color"$
	Dim scolor As String = $"${varColor} ${varIntensity}"$
	vue.SetStateSingle(pp, scolor)
	Avatar.Bind(":color", pp)
	Return Me
End Sub


'set color intensity
Sub SetSlot(varSlot As String) As VMAvatar
	Avatar.SetAttrSingle("slot", varSlot)
	Return Me
End Sub

Sub SetText(Text As String, txtTheme As String) As VMAvatar
	Dim lIcon As VMLabel
	lIcon.Initialize(vue, $"${ID}txt"$).SetText(Text).SetHeadline(True)
	If txtTheme <> "" Then
		lIcon.UseTheme(txtTheme)
	End If	'
	lIcon.Pop(Avatar)
	Return Me
End Sub

Sub SetImage(url As String, alt As String, props As Map, classes As List, attributes As List) As VMAvatar
	hasImage = True
	Image.SetSrc(url).SetAlt(alt)
	If attributes <> Null Then
		Image.SetAttributes(attributes)
	End If
	'
	If props <> Null Then
		For Each k As String In props.Keys
			Dim v As String = props.Get(k)
			Image.SetAttrSingle(k, v)
		Next
	End If
	'
	If classes <> Null Then
		For Each c As String In classes
			Image.AddClass(c)
		Next
	End If
	Return Me
End Sub

Sub AddComponent(comp As String) As VMAvatar
	Avatar.SetText(comp)
	Return Me
End Sub

'apply a theme to an element
Sub UseTheme(themeName As String) As VMAvatar
	themeName = themeName.ToLowerCase
	Dim themes As Map = vue.themes
	If themes.ContainsKey(themeName) Then
		Dim sclass As String = themes.Get(themeName)
		AddClass(sclass)
	End If
	Return Me
End Sub

'get component
Sub ToString As String
	
	If hasImage Then Image.Pop(Avatar)
	If hasIcon Then Icon.Pop(Avatar)
	Return Avatar.ToString
End Sub

Sub SetVModel(k As String) As VMAvatar
	Avatar.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMAvatar
	Avatar.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMAvatar
	Avatar.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMAvatar
	Dim childHTML As String = child.ToString
	Avatar.SetText(childHTML)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMAvatar
	Avatar.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMAvatar
	Avatar.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMAvatar
	Avatar.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set color
Sub SetColor(varColor As Object) As VMAvatar
	Dim pp As String = $"${ID}Color"$
	vue.SetStateSingle(pp, varColor)
	Avatar.Bind(":color", pp)
	Return Me
End Sub

'set height
Sub SetHeight(varHeight As Object) As VMAvatar
	Dim pp As String = $"${ID}Height"$
	vue.SetStateSingle(pp, varHeight)
	Avatar.Bind(":height", pp)
	Return Me
End Sub

'set left
Sub SetLeft(varLeft As Object) As VMAvatar
	Dim pp As String = $"${ID}Left"$
	vue.SetStateSingle(pp, varLeft)
	Avatar.Bind(":left", pp)
	Return Me
End Sub

'set max-height
Sub SetMaxHeight(varMaxHeight As Object) As VMAvatar
	Dim pp As String = $"${ID}MaxHeight"$
	vue.SetStateSingle(pp, varMaxHeight)
	Avatar.Bind(":max-height", pp)
	Return Me
End Sub

'set max-width
Sub SetMaxWidth(varMaxWidth As Object) As VMAvatar
	Dim pp As String = $"${ID}MaxWidth"$
	vue.SetStateSingle(pp, varMaxWidth)
	Avatar.Bind(":max-width", pp)
	Return Me
End Sub

'set min-height
Sub SetMinHeight(varMinHeight As Object) As VMAvatar
	Dim pp As String = $"${ID}MinHeight"$
	vue.SetStateSingle(pp, varMinHeight)
	Avatar.Bind(":min-height", pp)
	Return Me
End Sub

'set min-width
Sub SetMinWidth(varMinWidth As Object) As VMAvatar
	Dim pp As String = $"${ID}MinWidth"$
	vue.SetStateSingle(pp, varMinWidth)
	Avatar.Bind(":min-width", pp)
	Return Me
End Sub

'set right
Sub SetRight(varRight As Object) As VMAvatar
	Dim pp As String = $"${ID}Right"$
	vue.SetStateSingle(pp, varRight)
	Avatar.Bind(":right", pp)
	Return Me
End Sub

'set size
Sub SetSize(varSize As Object) As VMAvatar
	Dim pp As String = $"${ID}Size"$
	vue.SetStateSingle(pp, varSize)
	Avatar.Bind(":size", pp)
	Return Me
End Sub

'set tile
Sub SetTile(varTile As Object) As VMAvatar
	Dim pp As String = $"${ID}Tile"$
	vue.SetStateSingle(pp, varTile)
	Avatar.Bind(":tile", pp)
	Return Me
End Sub


Sub Hide As VMAvatar
	Avatar.SetVisible(False)
	Return Me
End Sub

Sub Show As VMAvatar
	Avatar.SetVisible(True)
	Return Me
End Sub

Sub Enable As VMAvatar
	Avatar.Enable(True)
	Return Me
End Sub

Sub Disable As VMAvatar
	Avatar.Disable(True)
	Return Me
End Sub


'bind a property to state
Sub Bind(prop As String, stateprop As String) As VMAvatar
	Avatar.Bind(prop, stateprop)
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMAvatar
	Avatar.RemoveAttr(sName)
	Return Me
End Sub

'set padding
Sub SetPaddingAll(p As String) As VMAvatar
	Avatar.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMarginAll(p As String) As VMAvatar
	Avatar.setmarginall(p)
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMAvatar
	Avatar.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMAvatar
	Avatar.SetTabIndex(ti)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bbind As Boolean) As VMAvatar
	Avatar.SetName(varName, bbind)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMAvatar
	Avatar.SetDisabled(b)
	Return Me
End Sub


Sub SetStyleSingle(prop As String, value As String) As VMAvatar
	Avatar.SetStyleSingle(prop, value)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, value As String) As VMAvatar
	Avatar.SetAttrSingle(prop, value)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMAvatar
	Avatar.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub