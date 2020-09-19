B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.3
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "timeLineCode"
	Public title As String = "TimeLine"
	Private vm As BANanoVM
	Private vue As BANanoVue
	Private BANano As BANano
End Sub


Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	cont.AddRows(10).AddColumns12
	'hide this container
	cont.Hide
	'
	Dim tltimeline1 As VMTimeline
	tltimeline1.Initialize(vue, "tltimeline1", Me)
	tltimeline1.SetVisible(True)
	'add each item
	Dim tlItemfirstname As VMTimelineItem
	tlItemfirstname.Initialize(vue, "tlItemfirstname", Me)
	tlItemfirstname.SetColorintensity("brown","")
	tlItemfirstname.SetLarge(True)
	tlItemfirstname.SetAvatar("./assets/sponge.png")
	tlItemfirstname.OppositeText.SetText("Anele")
	tltimeline1.AddTimeLineItem(tlItemfirstname)
	'
	Dim tlItemsurname As VMTimelineItem
	tlItemsurname.Initialize(vue, "tlItemsurname", Me)
	tlItemsurname.SetFilldot(True)
	tlItemsurname.SetIcon("mdi-plus")
	tlItemsurname.SetIconColorIntensity(vm.COLOR_RED, vm.INTENSITY_ACCENT4)	
	tlItemsurname.SetSmall(True)
	tlItemsurname.OppositeText.SetText("Mbanga")
	tltimeline1.AddTimeLineItem(tlItemsurname)
	
	'
	'use cards
	Dim tl3 As VMTimelineItem
	tl3.Initialize(vue, "tl3", Me)
	tl3.SetColor(vm.COLOR_ORANGE)
	tl3.SetFilldot(True)
	tl3.SetLeft(True)
	tl3.UsesCard = True
	tl3.CardTitle.SetColorIntensity(vm.COLOR_purple, vm.INTENSITY_lighten2)
	tl3.CardTitle.AddIcon1("icx1", "mdi-magnify", CreateMap("dark":True,"size":42,"color":"white"), Null, Array("mr-4"))
	tl3.CardTitle.AddElement("ich1", "h2", "Uses Card", Null, Null, Array("display-1 white--text font-weight-light"))
	'add 1 row with 1 column
	tl3.CardContainer.AddRows(1).AddColumns12
	Dim lblX As VMLabel = vm.CreateLabel("")
	lblX.SetParagraph.SetText(BANanoShared.LoremIpsum(1))
	tl3.CardContainer.AddComponent(1,1,lblX.ToString)
	tltimeline1.AddTimeLineItem(tl3)
	'
	Dim tl4 As VMTimelineItem
	tl4.Initialize(vue, "tl4", Me)
	tl4.SetColor(vm.COLOR_PURPLE)
	tl4.SetFilldot(True)
	tl4.SetRight(True)
	tl4.SetSmall(True)
	tl4.UsesCard = True
	tl4.CardTitle.SetColorIntensity(vm.COLOR_AMBER, vm.INTENSITY_lighten1)
	tl4.CardTitle.AddClass("justify-end")
	tl4.CardTitle.AddElement("ich2", "h2", "Uses Card 1", Null, Null, Array("display-1 mr-4 white--text font-weight-light"))
	tl4.CardTitle.AddIcon1("icx2", "mdi-home-outline", CreateMap("dark":True,"size":42,"color":"white"), Null, Null)
	'add 1 row with 1 column
	tl4.CardContainer.AddRows(1).AddColumns12
	Dim lblX As VMLabel = vm.CreateLabel("")
	lblX.SetParagraph.SetText(BANanoShared.LoremIpsum(1))
	tl4.CardContainer.AddComponent(1,1,lblX.ToString)
	tltimeline1.AddTimeLineItem(tl4)
	'
	tltimeline1.AddToContainer(cont,1,1)
	'initialize code builder
'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim tltimeline1 As VMTimeline"$)
vue.AddCode($"tltimeline1.Initialize(vue, "tltimeline1", Me)"$)
vue.AddCode($"tltimeline1.SetVisible(True)"$)
vue.AddCode($"'add each item"$)
vue.AddCode($"Dim tlItemfirstname As VMTimelineItem"$)
vue.AddCode($"tlItemfirstname.Initialize(vue, "tlItemfirstname", Me)"$)
vue.AddCode($"tlItemfirstname.SetColorintensity("brown","")"$)
vue.AddCode($"tlItemfirstname.SetLarge(True)"$)
vue.AddCode($"tlItemfirstname.SetAvatar("./assets/sponge.png")"$)
vue.AddCode($"tlItemfirstname.OppositeText.SetText("Anele")"$)
vue.AddCode($"tltimeline1.AddTimeLineItem(tlItemfirstname)"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim tlItemsurname As VMTimelineItem"$)
vue.AddCode($"tlItemsurname.Initialize(vue, "tlItemsurname", Me)"$)
vue.AddCode($"tlItemsurname.SetFilldot(True)"$)
vue.AddCode($"tlItemsurname.SetIcon("mdi-plus")"$)
vue.AddCode($"tlItemsurname.SetIconColorIntensity(vm.COLOR_RED, vm.INTENSITY_ACCENT4)"$)
vue.AddCode($"tlItemsurname.SetSmall(True)"$)
vue.AddCode($"tlItemsurname.OppositeText.SetText("Mbanga")"$)
vue.AddCode($"tltimeline1.AddTimeLineItem(tlItemsurname)"$)
vue.AddCode($""$)
vue.AddCode($"'"$)
vue.AddCode($"'use cards"$)
vue.AddCode($"Dim tl3 As VMTimelineItem"$)
vue.AddCode($"tl3.Initialize(vue, "tl3", Me)"$)
vue.AddCode($"tl3.SetColor(vm.COLOR_ORANGE)"$)
vue.AddCode($"tl3.SetFilldot(True)"$)
vue.AddCode($"tl3.SetLeft(True)"$)
vue.AddCode($"tl3.UsesCard = True"$)
vue.AddCode($"tl3.CardTitle.SetColorIntensity(vm.COLOR_purple, vm.INTENSITY_lighten2)"$)
vue.AddCode($"tl3.CardTitle.AddIcon1("icx1", "mdi-magnify", CreateMap("dark":True,"size":42,"color":"white"), Null, Array("mr-4"))"$)
vue.AddCode($"tl3.CardTitle.AddElement("ich1", "h2", "Uses Card", Null, Null, Array("display-1 white--text font-weight-light"))"$)
vue.AddCode($"'add 1 row with 1 column"$)
vue.AddCode($"tl3.CardContainer.AddRows(1).AddColumns12"$)
vue.AddCode($"Dim lblX As VMLabel = vm.CreateLabel("")"$)
vue.AddCode($"lblX.SetParagraph.SetText(BANanoShared.LoremIpsum(1))"$)
vue.AddCode($"tl3.CardContainer.AddComponent(1,1,lblX.ToString)"$)
vue.AddCode($"tltimeline1.AddTimeLineItem(tl3)"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim tl4 As VMTimelineItem"$)
vue.AddCode($"tl4.Initialize(vue, "tl4", Me)"$)
vue.AddCode($"tl4.SetColor(vm.COLOR_PURPLE)"$)
vue.AddCode($"tl4.SetFilldot(True)"$)
vue.AddCode($"tl4.SetRight(True)"$)
vue.AddCode($"tl4.SetSmall(True)"$)
vue.AddCode($"tl4.UsesCard = True"$)
vue.AddCode($"tl4.CardTitle.SetColorIntensity(vm.COLOR_AMBER, vm.INTENSITY_lighten1)"$)
vue.AddCode($"tl4.CardTitle.AddClass("justify-end")"$)
vue.AddCode($"tl4.CardTitle.AddElement("ich2", "h2", "Uses Card 1", Null, Null, Array("display-1 mr-4 white--text font-weight-light"))"$)
vue.AddCode($"tl4.CardTitle.AddIcon1("icx2", "mdi-home-outline", CreateMap("dark":True,"size":42,"color":"white"), Null, Null)"$)
vue.AddCode($"'add 1 row with 1 column"$)
vue.AddCode($"tl4.CardContainer.AddRows(1).AddColumns12"$)
vue.AddCode($"Dim lblX As VMLabel = vm.CreateLabel("")"$)
vue.AddCode($"lblX.SetParagraph.SetText(BANanoShared.LoremIpsum(1))"$)
vue.AddCode($"tl4.CardContainer.AddComponent(1,1,lblX.ToString)"$)
vue.AddCode($"tltimeline1.AddTimeLineItem(tl4)"$)
vue.AddCode($"'"$)
vue.AddCode($"tltimeline1.AddToContainer(cont,1,1)"$)
pgIndex.CreateVBCode(vue, Me, "timelinex", "Timeline", vue.GetSourceCode).AddToContainer(cont, 2, 1)


	'add timelines using v-for
	'create the details that each card will be created from
	Dim tlines As List = vue.NewList
	tlines.Add(CreateMap("color": "red lighten-2", "icon": "mdi-star","title":"AD ASTRA","year":"2019"))
	tlines.add(CreateMap("color": "purple darken-1", "icon": "mdi-book-variant","title":"WEST WORLD","year":"1973"))
	tlines.add(CreateMap("color": "green lighten-1", "icon": "mdi-airballoon","title":"ANNIHILATION","year":"2018"))
	tlines.add(CreateMap("color": "indigo", "icon": "mdi-buffer","title":"CONTACT","year":"1997"))
	'save the items to the state
	vue.Setdata("tlines", tlines)
	'create the timeline
	Dim txtline As VMTimeline
	txtline.Initialize(vue, "txline", Me)
	'align on topp
	txtline.SetAlignTop(True)
	'create a single timeline item that uses a v-for loop
	Dim titem As VMTimelineItem
	titem.Initialize(vue, "", Me)
	'for each item in tlines state
	titem.Setvfor("(item, i)", "tlines")
	'the key is the index
	titem.SetKey("i")
	'get the color of each item
	titem.Bind(":color", "item.color")
	'get the icon for each item
	titem.Bind(":icon", "item.icon")
	'fill the dot
	titem.SetFillDot(True)
	'each timeline item uses a card
	titem.UsesCard = True
	'the complete color of the card
	titem.Card.Bind(":color", "item.color")
	'make it dark
	titem.Card.SetDark(True)
	'define the title
	titem.CardTitle.AddClass("title")
	'use the title per each of the items
	titem.CardTitle.SetText("{{ item.title }}")
	'the background color of the card text should be white
	titem.CardText.SetColor(vm.COLOR_WHITE)
	' the color of the text should be prmary
	titem.CardText.SetTextColor(vm.COLOR_PRIMARY)
	'indicate the year of release
	titem.CardText.SetText($"<p>The movie was released in {{ item.year }})</p>"$)
	'use some lorem ipsum
	titem.CardText.SetText($"<p>${BANanoShared.LoremIpsum(1)}</p>"$)
	'add a button
	Dim btn As VMButton = vm.CreateButton("btnx", Me)
	btn.Bind(":color", "item.color")
	btn.Bind(":key", "item.title")
	btn.Bind(":id", "item.title")
	btn.AddClass("mx-0")
	btn.SetOutlined(True)
	btn.SetLabel("Watch")
	titem.CardText.SetText(btn.ToString)
		
	'add the item to the timeline
	txtline.AddTimeLineItem(titem)
	'
	txtline.AddToContainer(cont,3,1)
	'
	
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"'add timelines using v-for"$)
vue.AddCode($"'create the details that each card will be created from"$)
vue.AddCode($"Dim tlines As List = vue.NewList"$)
vue.AddCode($"tlines.Add(CreateMap("color": "red lighten-2", "icon": "mdi-star","title":"AD ASTRA","year":"2019"))"$)
vue.AddCode($"tlines.add(CreateMap("color": "purple darken-1", "icon": "mdi-book-variant","title":"WEST WORLD","year":"1973"))"$)
vue.AddCode($"tlines.add(CreateMap("color": "green lighten-1", "icon": "mdi-airballoon","title":"ANNIHILATION","year":"2018"))"$)
vue.AddCode($"tlines.add(CreateMap("color": "indigo", "icon": "mdi-buffer","title":"CONTACT","year":"1997"))"$)
vue.AddCode($"'save the items to the state"$)
vue.AddCode($"vue.Setdata("tlines", tlines)"$)
vue.AddCode($"'create the timeline"$)
vue.AddCode($"Dim txtline As VMTimeline"$)
vue.AddCode($"txtline.Initialize(vue, "txline", Me)"$)
vue.AddCode($"'align on topp"$)
vue.AddCode($"txtline.SetAlignTop(True)"$)
vue.AddCode($"'create a single timeline item that uses a v-for loop"$)
vue.AddCode($"Dim titem As VMTimelineItem"$)
vue.AddCode($"titem.Initialize(vue, "", Me)"$)
vue.AddCode($"'for each item in tlines state"$)
vue.AddCode($"titem.Setvfor("(item, i)", "tlines")"$)
vue.AddCode($"'the key is the index"$)
vue.AddCode($"titem.SetKey("i")"$)
vue.AddCode($"'get the color of each item"$)
vue.AddCode($"titem.Bind(":color", "item.color")"$)
vue.AddCode($"'get the icon for each item"$)
vue.AddCode($"titem.Bind(":icon", "item.icon")"$)
vue.AddCode($"'fill the dot"$)
vue.AddCode($"titem.SetFillDot(True)"$)
vue.AddCode($"'each timeline item uses a card"$)
vue.AddCode($"titem.UsesCard = True"$)
vue.AddCode($"'the complete color of the card"$)
vue.AddCode($"titem.Card.Bind(":color", "item.color")"$)
vue.AddCode($"'make it dark"$)
vue.AddCode($"titem.Card.SetDark(True)"$)
vue.AddCode($"'define the title"$)
vue.AddCode($"titem.CardTitle.AddClass("title")"$)
vue.AddCode($"'use the title per each of the items"$)
vue.AddCode($"titem.CardTitle.SetText("{{ item.title }}")"$)
vue.AddCode($"'the background color of the card text should be white"$)
vue.AddCode($"titem.CardText.SetColor(vm.COLOR_WHITE)"$)
vue.AddCode($"' the color of the text should be prmary"$)
vue.AddCode($"titem.CardText.SetTextColor(vm.COLOR_PRIMARY)"$)
vue.AddCode($"'indicate the year of release"$)
vue.AddCode($"titem.CardText.SetText(~"<p>The movie was released in {{ item.year }})</p>"~)"$)
vue.AddCode($"'use some lorem ipsum"$)
vue.AddCode($"titem.CardText.SetText($"<p>~{BANanoShared.LoremIpsum(1)}</p>"~)"$)
vue.AddCode($"'add a button"$)
vue.AddCode($"Dim btn As VMButton = vm.CreateButton("btnx", Me)"$)
vue.AddCode($"btn.Bind(":color", "item.color")"$)
vue.AddCode($"btn.Bind(":key", "item.title")"$)
vue.AddCode($"btn.Bind(":id", "item.title")"$)
vue.AddCode($"btn.AddClass("mx-0")"$)
vue.AddCode($"btn.SetOutlined(True)"$)
vue.AddCode($"btn.SetLabel("Watch")"$)
vue.AddCode($"titem.CardText.SetText(btn.ToString)"$)
vue.AddCode($""$)
vue.AddCode($"'add the item to the timeline"$)
vue.AddCode($"txtline.AddTimeLineItem(titem)"$)
vue.AddCode($""$)
vue.AddCode($"'Trap button clicks and get the id of the clicked button"$)
vue.AddCode($"Sub btnx_click(e As BANanoEvent)"$)
vue.AddCode($"'get the id of the selected button"$)
vue.AddCode($"Dim btnID As String = vm.GetIDFromEvent(e)"$)
vue.AddCode($"'show the button id"$)
vue.AddCode($"vm.ShowSnackBarSuccess(btnID)"$)
vue.AddCode($"End Sub"$)
pgIndex.CreateVBCode(vue, Me, "dynamictimeline", "Dynamic Timeline", vue.GetSourceCode).AddToContainer(cont, 4, 1)
	
	'add container to page
	vm.AddContainer(cont)
	
End Sub

Sub btnx_click(e As BANanoEvent)
	'get the id of the selected button
	Dim btnID As String = vm.GetIDFromEvent(e)
	'show the button id
	vm.ShowSnackBarSuccess(btnID)
End Sub

Sub timelinexcopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("timelinex")
End Sub

Sub timelinexdownload_click(e As BANanoEvent)
	vue.DownloadCode("timelinex", "timelinex.txt")
End Sub



Sub dynamictimelinecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("dynamictimeline")
End Sub

Sub dynamictimelinedownload_click(e As BANanoEvent)
	vue.DownloadCode("dynamictimeline", "dynamictimeline.txt")
End Sub

