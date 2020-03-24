B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Private vue As BANanoVue
	Public App As VFApp
	Public Content As VFContent
	Private VF As BANanoObject
	Public Drawer As VFDrawer
	Public AppBar As VFAppBar
	Public Footer As VFFooter
	Public SysBar As VFSysBar
	Public BottomNav As VFBottomNav
End Sub

Public Sub Initialize()
	vue.Initialize 
	App.Initialize(vue,"")
	Drawer.Initialize(vue,"") 
	AppBar.Initialize(vue,"") 
	Content.Initialize(vue,"")
	Footer.Initialize(vue,"") 
	SysBar.Initialize(vue,"") 
	BottomNav.Initialize(vue,"") 
	'
	VF.Initialize2("Vuetify", Null)
	vue.SetOptionBO("vuetify", VF)
End Sub

Sub Container(sid As String) As VFContainer
	Dim el As VFContainer
	el.Initialize(vue, sid)
	Return el
End Sub

Sub Ux
	SysBar.Pop(App.App)
	Drawer.Pop(App.App)
	AppBar.Pop(App.App)
	Content.Pop(App.app)
	Footer.Pop(App.App)
	BottomNav.Pop(App.App)
	vue.SetTemplate(App.ToString)
	vue.ux
End Sub
