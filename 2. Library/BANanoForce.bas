B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private BANAno As BANano  'ignore
	Private force As BANanoObject
	Private ID As String
	Private opt As Map
	Private prop As Map
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(elID As String) As BANanoForce
	ID = elID.tolowercase
	BANAno.DependsOnAsset("force.min.js")
	force.Initialize("force") 
	opt = CreateMap()
	prop = CreateMap()
	SetCssTransitions(True)
	SetCacheJumps(True)
	Return Me
End Sub

Sub SetHash(b As Boolean) As BANanoForce
	opt.Put("setHash", b)
	Return Me
End Sub

Sub SetTop(t As String) As BANanoForce
	If t = "" Then Return Me
	prop.Put("top", t)
	Return Me
End Sub


Sub SetBottom(b As String) As BANanoForce
	If b = "" Then Return Me
	prop.Put("bottom", b)
	Return Me
End Sub


Sub SetRight(r As String) As BANanoForce
	If r = "" Then Return Me
	prop.Put("right", r)
	Return Me
End Sub


Sub SetLeft(l As String) As BANanoForce
	If l = "" Then Return Me
	prop.Put("left", l)
	Return Me
End Sub

Sub SetCacheScrolling(b As Boolean) As BANanoForce
	opt.Put("cacheScrolling", b)
	Return Me
End Sub

Sub SetFrames(f As Int) As BANanoForce
	f = BANAno.parseInt(f)
	opt.Put("frames", f)
	Return Me
End Sub

Sub SetJumpDuration(j As Int) As BANanoForce
	j = BANAno.parseInt(j)
	opt.Put("jumpDuration", j)
	Return Me
End Sub

Sub SetCacheJumps(b As Boolean) As BANanoForce
	opt.Put("cacheJumps", b)
	Return Me
End Sub

Sub SetCssTransitions(b As Boolean) As BANanoForce
	opt.Put("cssTransitions",b)
	Return Me
End Sub

Sub SetMoveEasing(m As String) As BANanoForce
	opt.Put("moveEasing", m)
	Return Me
End Sub

Sub SetScrollEasing(m As String) As BANanoForce
	opt.Put("scrollEasing", m)
	Return Me
End Sub

Sub SetJumpEasing(j As String) As BANanoForce
	opt.Put("jumpEasing", j)
	Return Me
End Sub

Sub SetMoveDuration(m As Int) As BANanoForce
	m = BANAno.parseInt(m)
	opt.Put("moveDuration", m)
	Return Me
End Sub

Sub SetDuration(d As Int) As BANanoForce
	d = BANAno.parseInt(d)
	opt.Put("duration", d)
	Return Me
End Sub

Sub SetEasing(easing As String) As BANanoForce
	If easing = "" Then Return Me
	opt.Put("easing", easing)
	Return Me
End Sub

Sub SetOnDone(eventHandler As Object, methodName As String) As BANanoForce
	methodName = methodName.tolowercase
	Dim cb As BANanoObject = BANAno.CallBack(eventHandler, methodName, Null)
	opt.Put("done", cb)
	Return Me
End Sub

Sub Move1(properties As Map, duration As Int, eventHandler As Object, methodName As String)
	duration = BANAno.parseInt(duration)
	methodName = methodName.tolowercase
	Dim el As BANanoObject = BANAno.Window.GetField("document").RunMethod("getElementById", Array(ID))
	Dim cb As BANanoObject = BANAno.CallBack(eventHandler, methodName, Null)
	force.RunMethod("move", Array(el, properties, duration, cb))
End Sub

Sub Move
	Dim el As BANanoObject = BANAno.Window.GetField("document").RunMethod("getElementById", Array(ID))
	opt.Put("properties", prop)
	force.RunMethod("move", Array(el, opt))
End Sub

Sub Jump
	Dim el As BANanoObject = BANAno.Window.GetField("document").RunMethod("getElementById", Array(ID))
	opt.Put("properties", prop)
	force.RunMethod("jump", Array(el, opt))
End Sub