B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private home As VMComponent
	Private vm As BANanoVM
	Private vue As BANanoVue
	Private BANano As BANano
End Sub

'build the page
Sub Initialize
	vm = pgIndex.vm
	vue = pgIndex.vue
	
	'initialize the component,  the name of the component is 'home'
	home.Initialize(vue, "home", "/", Me)
	'
	Dim chatCard As VMElement = vm.VCard("chatcard").AddClass("mx-auto mt-4")
	chatCard.AddAttributes(CreateMap("elevation": "10", "max-width": "700"))
	chatCard.AddAttr("v-show", "$store.signedin")
	'
'	Dim ctoolbar As VMElement = vm.VToolBar("chatbar").AddAttr("flat", True)
'		
'	'add a search
'	Dim txtSearch As VMElement = vm.VTextField("txtsearch")
'	txtSearch.AddAttributes(CreateMap("hide-details": True, "prepend-icon": "search", "single-line": True))
'	txtSearch.AddStyle("max-width", "200px")
'	
'	ctoolbar.AddElement(txtSearch)
'	chatCard.AddElement(ctoolbar)
'	chatCard.AddDivider
	
	Dim ctext As VMElement = vm.VCardText("").AddClass("mx-1")
	Dim navbar As VMElement = vm.VNavigationDrawer("").AddAttr("width", "100%").AddClass("mx-1").AddAttr("floating", True)
	
	'create text
	Dim clist As VMElement = vm.VList("").AddAttr("three-line", True)
	clist.AddAttr("height", "80vh").AddAttr("max-height", "80vh")
	'create a list group
	Dim lig As VMElement = vm.VListItemGroup("")
	lig.AddAttributes(CreateMap("v-model": "$store.selectedmessages", "multiple": True, "active-class": "pink--text"))
	'create a template that uses a loop for each message
	Dim tmp As VMElement = vm.VTemplate("").AddAttr("v-for", "(item, i) in $store.messages")
	'we have a list item, link it to each message
	Dim lit As VMElement = vm.VListItem("lit").AddAttr(":key", "item.id")
	'
	Dim tmp1 As VMElement = vm.VTemplate("tmp1").AddAttr("v-slot:default", "{ active, toggle }")
	'add the avatar
	Dim avt As VMElement = vm.VListItemAvatar("").AddElement(vm.VImg("img").AddAttr(":src", "item.profilepicurl"))
	'create content for list
	Dim cnt As VMElement = vm.VListItemContent("")
	cnt.AddElement(vm.VListItemTitle("").AddAttr("v-text", "item.name"))
	cnt.AddElement(vm.VListItemSubTitle("").SetText("").AddAttr("v-if", "item.text"))
	cnt.AddElement(vm.VListItemSubTitle("").AddAttr("v-text", "item.text").AddAttr("v-if", "item.text"))
	Dim img As VMElement = vm.VImg("").AddAttributes(CreateMap("v-if":"item.imageurl", ":src": "item.imageurl", "width":"200px", "height":"200px"))
	img.AddStyles(CreateMap("background-repeat": "no-repeat", "background-size": "200px", "border-radius": "20px"))
	cnt.AddElement(img)
		'
	Dim lia As VMElement = vm.VListItemAction("").AddElement(vm.VListItemActionText("liad").AddAttr("v-text", "dateoconv(item.timestamp)"))
		
	tmp1.AddElement(avt)
	tmp1.AddElement(cnt)
	tmp1.AddElement(lia)
	'
	lit.AddElement(tmp1)
	tmp.AddElement(lit)
	tmp.AddDivider
	lig.AddElement(tmp)
	clist.AddElement(lig)
	navbar.AddElement(clist)
	ctext.AddElement(navbar)
	chatCard.AddElement(ctext)
	
	Dim cdiv As VMElement = vm.VDivider("cdiv1")
	cdiv.AddToParent(chatCard)
	
	'create actions
	Dim cactions As VMElement = vm.VCardActions("cactions")
	'create a toolbar
	Dim msgtoolbar As VMElement = vm.VToolBar("msgtoolbar").AddAttr("flat", True)
	'create the msg
	Dim txtmsg As VMElement = vm.VTextField("txtmsg")
	txtmsg.AddAttributes(CreateMap("clearable": True, "label": "Message", "rounded": True, "outlined": True))
	txtmsg.AddAttributes(CreateMap("dense": True, "hide-details": True, "v-model": "$store.message"))
	txtmsg.AddAttributes(CreateMap("autocomplete": "off"))
	'when enter is pressed on the textfield, fire newmessage
	txtmsg.AddAttributes(CreateMap("@keydown.enter": "newmessage", ":disabled": "$store.msgmessage"))
	'add text to toolbar
	msgtoolbar.Addelement(txtmsg)
	'create the sender icon
	Dim btnSend As VMElement = vm.VBtn("").AddAttributes(CreateMap("@click": "newmessage","text":True,"icon":True))
	btnSend.AddElement(vm.VIcon("").SetText("mdi-send-circle-outline"))
	btnSend.AddClass("mx-2")
	msgtoolbar.AddElement(btnSend)
	'create an image picker
	Dim btnImgSend As VMElement = vm.VFileInput("imagechooser")
	btnImgSend.AddAttributes(CreateMap(":key":"imagechooser","accept": "image/png, image/jpeg, image/bmp", "prepend-icon": "mdi-camera", "hide-input": True, "icon":True))
	btnImgSend.AddAttributes(CreateMap("@change": "sendimage", "capture":"camera")).AddClass("shrink")
	msgtoolbar.AddElement(btnImgSend)
	'add toolbar to actions
	cactions.AddElement(msgtoolbar)
	chatCard.AddElement(cactions)
	'
	home.AddElement(chatCard)
	'
	home.setmethod(Me, "newmessage")
	home.Setmethod(Me, "dateoconv")
	home.SetMethod(Me, "sendimage")
	home.SetData("imagechooser", DateTime.now)
	'add the component as a router/page
	vm.AddRoute(home)
End Sub

'open file chooser and get file contents
Sub sendimage(fo As Object)
	If BANano.isnull(fo) Or BANano.IsUndefined(fo) Then Return
	'add the image message to the database
	vue.RunMethod("addimage", fo)
	home.SetData("imagechooser", DateTime.now)
End Sub

Sub DateOconv(sdate As String) As String
	Dim dateX As BANanoObject
	Dim res As String = dateX.Initialize4("moment", sdate).RunMethod("format", Array("llll")).Result
	Return res
End Sub

Sub newmessage(e As BANanoEvent)
	'get the message entered
	Dim smessage As String = vue.getdataglobal("message")
	smessage = smessage.trim
	If smessage = "" Then Return
	'add the message to the database
	vue.RunMethod("addmessage", smessage)
End Sub