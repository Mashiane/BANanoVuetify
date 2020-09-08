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
	Dim ctoolbar As VMElement = vm.VToolBar("chatbar").AddAttr("flat", True)
		
	'add a search
	Dim txtSearch As VMElement = vm.VTextField("txtsearch")
	txtSearch.AddAttributes(CreateMap("hide-details": True, "prepend-icon": "search", "single-line": True))
	txtSearch.AddStyle("max-width", "200px")
	
	ctoolbar.AddElement(txtSearch)
	chatCard.AddElement(ctoolbar)
	chatCard.AddDivider
	
	'create text
	Dim clist As VMElement = vm.VList("clist").AddAttr("three-line", True).AddStyle("height", "80vh")
	'
	Dim lig As VMElement = vm.VListItemGroup("lig")
	lig.AddAttributes(CreateMap("v-model": "$store.selectedmessages", "multiple": True, "active-class": "pink--text"))
	'
	Dim tmp As VMElement = vm.VTemplate("lt")
	tmp.AddAttr("v-for", "(item, i) in $store.messages")
	'
	Dim lit As VMElement = vm.VListItem("lit").AddAttr(":key", "item.id")
	'
	Dim tmp1 As VMElement = vm.VTemplate("tmp1").AddAttr("v-slot:default", "{ active, toggle }")
	'
	Dim avt As VMElement = vm.VListItemAvatar("avt")
	'
	Dim img As VMElement = vm.VImg("img").AddAttr(":src", "item.profilepicurl")
	'
	Dim cnt As VMElement = vm.VListItemContent("licm")
	'
	Dim litt As VMElement = vm.VListItemTitle("litt").AddAttr("v-text", "item.name")
	'
	Dim st1 As VMElement = vm.VListItemSubTitle("list1").SetText("")
	'
	Dim st2 As VMElement = vm.VListItemSubTitle("list2").AddAttr("v-text", "item.text")
	'
	Dim lia As VMElement = vm.VListItemAction("lia1")
	Dim liad As VMElement = vm.VListItemActionText("liad").AddAttr("v-text", "item.timestamp")
	liad.AddToParent(lia)
	
	'add the avatar first
	avt.AddElement(img)
	
	'add the content
	cnt.AddElement(litt)
	cnt.AddElement(st1)
	cnt.AddElement(st2)
	'
	tmp1.AddElement(avt)
	tmp1.AddElement(cnt)
	tmp1.AddElement(lia)
	
	lit.AddElement(tmp1)
	tmp.AddElement(lit)
	lig.AddElement(tmp)
	clist.AddElement(lig)
	chatCard.AddElement(clist)
	
	Dim cdiv As VMElement = vm.VDivider("cdiv1")
	cdiv.AddToParent(chatCard)
	
	'create actions
	Dim cactions As VMElement = vm.VCardActions("cactions")
	'add form inside actions
	Dim msgform As VMElement = vm.Form("msgform").AddStyle("width", "100%")
	'add container
	Dim formcont As VMElement = vm.VContainer("formcont")
	formcont.AddAttributes(CreateMap("fluid": True, "nogutters": True))
	'add row
	Dim r1 As VMElement = vm.VRow("msgformr1")
	Dim r1c1 As VMElement = vm.VCol("msgformr1c1").AddSizes("12","12","12","12")
	'
	Dim txtmsg As VMElement = vm.VTextField("txtmsg")
	txtmsg.AddAttributes(CreateMap("clearable": True, "label": "Message", "rounded": True, "outlined": True))
	txtmsg.AddAttributes(CreateMap("dense": True, "hide-details": True, "v-model": "$store.message", "append-icon": "mdi-send-circle-outline"))
	'when enter is pressed on the textfield, fire newmessage
	txtmsg.AddAttributes(CreateMap("@keydown.enter": "newmessage", ":disabled": "$store.msgmessage"))
	r1c1.AddElement(txtmsg)
	r1.AddElement(r1c1)
	formcont.AddElement(r1)
	msgform.AddElement(formcont)
	cactions.AddElement(msgform)
	chatCard.AddElement(cactions)
	'
	home.AddElement(chatCard)
	'
	home.setmethod(Me, "newmessage")
	'add the component as a router/page
	vm.AddRoute(home)
End Sub


Sub newmessage(e As BANanoEvent)
	'get the message entered
	Dim smessage As String = vue.getdataglobal("message")
	'add the message to the database
	vue.RunMethod("addmessage", smessage)
End Sub