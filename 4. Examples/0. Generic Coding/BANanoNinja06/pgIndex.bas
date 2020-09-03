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
	BuildButton
	
	BuildIcon
	
	BuildAlerts
	'
	BuildAvatar
	
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

Sub BuildAvatar
	'create a row
	'<v-row justify="space-around">
	Dim r1 As VMElement = vm.NewElement("r1", "v-row", Null, Null, Null, Null, "")
	r1.AddAttr("justify", "space-around")
	
	'<v-avatar color="indigo" size="36">
	'<span class="white--text headline">36</span>
	'</v-avatar>
	
	'create the span
	Dim av1span As VMElement = vm.NewElement("av1span", "span", Null, Null, Array("white--text"), Array("headline"), "36")
	'create the avatar with a span inside
	Dim av1 As VMElement = vm.NewElement("av1", "v-avatar", CreateMap("color":"indigo","size":36), Null, Null, Null, av1span.tostring)
	
	'add av1 to row
	av1.AddToParent(r1)
	
	'add row to the page container
	vm.AddElement(r1)
	
End Sub


Sub BuildButton
	'create a row
	'<v-row justify="space-around">
	Dim rx As VMElement = vm.NewElement("rx", "v-row", Null, Null, Null, Null, "")
	rx.AddAttr("justify", "space-around")
	rx.AddClass("ma-4")
	
'	<v-btn
'	class="mx-1"
'	color="primary"
'	@click="messages++"
'	>
'	Click Me
'	</v-btn>
	
	'create the button
	'set the label of the button
	vue.SetData("btn1label", "Click Me")
	vue.setdata("messages", "")
	'add a button with a label to be sourced from the state
	Dim btn1 As VMElement = vm.NewElement("btn1", "v-btn", CreateMap("color":"primary"), Null, Null, Null, "{{ btn1label }} {{ messages }}")
	'link the event
	'v-on:click
	btn1.AddAttr("@click", "incrementmessages")
	'add a class
	btn1.AddClass("mx-1")
	'add av1 to row
	btn1.AddToParent(rx)
	
	'add row to the page container
	vm.AddElement(rx)
	
	'register the event
	vue.SetMethod(Me, "incrementmessages")
End Sub

Sub incrementmessages
	'read the number of messages
	vue.Increment("messages", 1)
	'read the counter
	Dim msgCnt As Int = vue.getdata("messages")
	msgCnt = BANano.parseint(msgCnt)
	If msgCnt > 10 Then
		'set the messages to blank
		vue.SetData("messages", "")
		vue.SetData("btn1label", "Done")
		vue.setdata("icncolor", "orange")
	End If
End Sub

Sub BuildIcon
	Dim ra As VMElement = vm.NewElement("ra", "v-row", Null, Null, Null, Null, "")
	ra.AddAttr("justify", "space-around")
	ra.AddClass("ma-4")
	
	'
	Dim icncolor As String = "purple"
	vue.setdata("icncolor", icncolor)
	'
	'<v-icon large color="purple">mdi-dialpad</v-icon>
	Dim icn As VMElement = vm.CreateElement("icn", "v-icon")
	icn.AddAttr("large", True)
	'bind the color attribute to the state
	icn.AddAttr(":color", "icncolor")
	icn.SetText("mdi-dialpad")
	icn.AddToParent(ra)
	vm.AddElement(ra)
End Sub