B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
Sub Class_Globals
	Private BANano As BANano
	Public vue As BANanoVue
	Private Pages As List
	Public VApp As VMElement
	Public VContent As VMElement
	Public VContainer As VMElement
	Public BOVuetify As BANanoObject
	Public VNavigationDrawer As VMElement
	Public VAppBar As VMElement
	Public VFooter As VMElement
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(eventHandler As Object, appName As String)
	'create a new instance of vuetify
	BOVuetify.Initialize2("Vuetify", Null)
	'initialize the pages
	Pages.initialize
	'initialize vue
	vue.Initialize
	'
	VApp.Initialize(vue, appName).SetTag("v-app")
	VContent.Initialize(vue, $"${appName}content"$).SetTag("v-content")
	VContainer.Initialize(vue, $"${appName}container"$).SetTag("v-container")
	VNavigationDrawer.Initialize(vue, $"${appName}navdrawer"$).SetTag("v-navigation-drawer").SetAttrSingle("app", True)
	VAppBar.Initialize(vue, $"${appName}appbar"$).SetTag("v-app-bar").SetAttrSingle("app", True)
	VFooter.Initialize(vue, $"${appName}footer"$).SetTag("v-footer").SetAttrSingle("app", True)
End Sub

'build the page
Sub UX
	VNavigationDrawer.Pop(VApp)
	VAppBar.Pop(VApp)
	
	VContainer.Pop(VContent)
	VContent.Pop(VApp)
	vue.SetTemplate(VApp.ToString)
	'
	'set vuetify to the vue scope
	vue.SetFrameWork("vuetify", BOVuetify)
	vue.ux
End Sub