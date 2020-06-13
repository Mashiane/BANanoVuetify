B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public AvatarGroup As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private module As Object
	Private DesignMode As Boolean
	Private bStatic As Boolean
	Private pDiv As VMElement
	Private numAvatars As Int
End Sub

'initialize the AvatarGroup
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMAvatarGroup
	BANano.DependsOnAsset("avatargroup.min.css")
	ID = sid.tolowercase
	vue = v
	AvatarGroup.Initialize(v, ID).SetTag("section")
	module = eventHandler
	DesignMode = False
	AvatarGroup.SetVShow($"${ID}show"$)
	pDiv.Initialize(vue, $"${ID}pdiv"$).AddClass("avatar-group")
	numAvatars = 0
	Return Me
End Sub

Sub AddAvatar(aID As String, url As String)
	numAvatars = numAvatars + 1
	Dim aParent As VMElement
	Dim aChild As VMElement
	aParent.Initialize(vue, aID).settag("div").addclass("avatarg")
	aChild.initialize(vue, $"${aID}img"$).Settag("img")
	aChild.setattrsingle("src", url)
	'
	aParent.setdesignmode(DesignMode).SetStatic(bStatic)
	aChild.setdesignmode(DesignMode).SetStatic(bStatic)
	'
	aParent.AddComponent(aChild.tostring)
	pDiv.AddComponent(aParent.tostring)
End Sub


'set static
Sub SetStatic(b As Boolean) As VMAvatarGroup
	AvatarGroup.SetStatic(b)
	pDiv.SetStatic(b)
	bStatic = b
	Return Me
End Sub

Sub AddDynamicClass(className As String) As VMAvatarGroup
	AvatarGroup.AddDynamicClass(className)
	Return Me
End Sub

'the image should be centered on the RC
Sub SetCenterOnParent(b As Boolean) As VMAvatarGroup
	If b = False Then Return Me
	AvatarGroup.CenterOnParent = True
	Return Me
End Sub

'set the row and column position
Sub SetRC(sRow As String, sCol As String) As VMAvatarGroup
	AvatarGroup.SetRC(sRow, sCol)
	Return Me
End Sub

Sub SetAttrLoose(loose As String) As VMAvatarGroup
	AvatarGroup.SetAttrLoose(loose)
	Return Me
End Sub

Sub SetAttributes(attrs As List) As VMAvatarGroup
	For Each stra As String In attrs
		SetAttrLoose(stra)
	Next
	Return Me
End Sub


public Sub RemoveAttr(sName As String) As VMAvatarGroup
	AvatarGroup.RemoveAttr(sName)
	Return Me
End Sub

Sub SetContainer(b As Boolean) As VMAvatarGroup
	If b = False Then Return Me
	AvatarGroup.AddClass("container")
	Return Me
End Sub

Sub Hide As VMAvatarGroup
	AvatarGroup.SetVisible(False)
	Return Me
End Sub

Sub Show As VMAvatarGroup
	AvatarGroup.SetVisible(True)
	Return Me
End Sub

'get component
Sub ToString As String
	pDiv.SetAttrsingle("data-group-size", numAvatars)
	AvatarGroup.AddComponent(pDiv.tostring)
	Return AvatarGroup.ToString
End Sub

Sub SetDesignMode(b As Boolean) As VMAvatarGroup
	AvatarGroup.SetDesignMode(b)
	pDiv.setdesignmode(b)
	DesignMode = b
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMAvatarGroup
	AvatarGroup.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMAvatarGroup
	AvatarGroup.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMAvatarGroup
	Dim childHTML As String = child.ToString
	AvatarGroup.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMAvatarGroup
	If t = "" Then Return Me
	AvatarGroup.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMAvatarGroup
	AvatarGroup.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMAvatarGroup
	AvatarGroup.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMAvatarGroup
	AvatarGroup.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMAvatarGroup
	AvatarGroup.SetPaddingAll(p)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMAvatarGroup
	AvatarGroup.SetDisabled(b)
	Return Me
End Sub

Sub SetKey(k As String) As VMAvatarGroup
	AvatarGroup.SetKey(k, False)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

Sub BuildModel(mprops As Map, mstyles As Map, lclasses As List, loose As List) As VMAvatarGroup
	AvatarGroup.BuildModel(mprops, mstyles, lclasses, loose)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMAvatarGroup
	AvatarGroup.SetVisible(b)
	Return Me
End Sub
