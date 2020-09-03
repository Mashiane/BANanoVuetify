B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12, 15
Sub Process_Globals
	Private BANano As BANano  'ignore
	Public vm As BANanoVM
	Public vue As BANanoVue   'ignore
End Sub

Sub Init
	'initialize the page
	vm.Initialize(Me, Main.appname)
	vue = vm.vue
	'we want to use a blank template
	vm.UseBlankTemplate
	'
	BuildNavBar
	'
	BuildAlerts
	
	vm.ux
End Sub


Sub BuildNavBar
	'create the app bar
	Dim navBar As VMElement = vm.NewElement("navbar", "v-app-bar", Null, Null, Null, Array("app"), "")
	
	'create the toolbar title
	Dim title As VMElement = vm.NewElement("lbltitle", "v-toolbar-title", Null, Null, Array("headline", "text-uppercase"), Null, "BANano")
	
	'create a span To add To the title
	Dim spant As VMElement = vm.NewElement("spant", "span", Null, Null, Array("ml-1","text-lowercase"), Null, "Ninja")
	
	'add the span To the title
	spant.AddToParent(title)
	
	'add title To the toolbar
	title.AddToParent(navBar)
	
	'create a spacer And add it To the appbar
	Dim spcer1 As VMElement = vm.NewSpacer("spcer1p")
	spcer1.AddToParent(navBar)
	
	'download b4j
	Dim btnj As VMElement = vm.NewElement("b4j", "v-btn", CreateMap("text":True,"target":"_blank"),Null, Null, Null, "B4J")
	btnj.AddAttr("href","https://www.b4x.com/b4j.html")
	btnj.AddAttr("color", vm.COLOR_BLUE)
	btnj.AddToParent(navBar)
	
	'add a divider
	Dim div0 As VMElement = vm.NewDivider("div0")
	div0.AddAttr("vertical", True)
	div0.AddToParent(navBar)
	
	'create a button To add To the navBar
	Dim btn1 As VMElement = vm.NewElement("btn1", "v-btn", CreateMap("target":"_blank","text":True),Null, Null, Null, "BANano")
	btn1.AddAttr("href","https://www.b4x.com/android/forum/threads/banano-website-app-pwa-library-with-abstract-designer-support.99740/#post-627764")
	btn1.AddAttr("color", vm.COLOR_GREEN)
	btn1.AddToParent(navBar)
	
	'add a divider
	Dim div1 As VMElement = vm.NewDivider("div1")
	div1.AddAttr("vertical", True)
	div1.AddToParent(navBar)
	
	'add a button To link To BANanoVuetify
	Dim btn2 As VMElement = vm.NewElement("btn2", "v-btn", CreateMap("target":"_blank","text":True), Null, Null, Null, "BANanoVuetify")
	btn2.AddAttr("href", "https://github.com/Mashiane/BANanoVuetify")
	btn2.AddAttr("color", vm.COLOR_ORANGE)
	btn2.AddToParent(navBar)
	
	'add navBar To the app
	navBar.AddToParent(vm.VApp)
	
End Sub

'build the alerts
Sub BuildAlerts
	'<v-alert Type="success">
	'I'm a success alert.
	'</v-alert>
	'create the alert
	Dim al1 As VMElement = vm.NewElement("al1", "v-alert", CreateMap("type":"success","value":True), Null, Null, Null, "I'm a success alert")
	'add to the page container inside <main
	vm.AddElement(al1)
	'
	Dim al2 As VMElement = vm.NewElement("al2", "v-alert", CreateMap("type":"success","value":True,"border":"right"), Null, Null, Null, "I'm a success alert")
	'add to the page container inside <main
	vm.AddElement(al2)
	'
	'alert bound to a state
	vue.SetData("al3visible", False)
	'create a hidden alert
	Dim al3 As VMElement = vm.NewElement("al3", "v-alert", CreateMap("type":"warning","v-model":"al3visible"), Null, Null, Null, vm.LoremIpsum)
	'add to the page container inside <main
	vm.AddElement(al3)
	
	'lets create a timer to change the state of the alert every 3 seconds
	BANanoShared.SetInterval(Me, "ToggleAl3", 3000, Null)
End Sub

Sub ToggleAl3
	'toggle the state of al3visible. if true make false, if false make true
	vm.ToggleState("al3visible")
End Sub