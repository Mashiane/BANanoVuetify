B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "chipsCode"
	Public title As String = "Chips"
	Private vm As BANanoVM
	Private BANano As BANano  'ignore
	Private vue As BANanoVue
End Sub


Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	cont.AddRows(10).AddColumns12
	'
	Dim chipsx As VMContainer = vm.CreateContainer("chips", Me).SetTextCenter
		
	vm.CreateChip("c1", Me).AddClass("ma-2").SetText("Default").AddToContainer(chipsx, 0 , 0)
	vm.CreateChip("c2", Me).AddClass("ma-2").SetText("Primary").SetColor("primary").AddToContainer(chipsx, 0 , 0)
	vm.CreateChip("c3", Me).AddClass("ma-2").SetText("Secondary").SetColor("secondary").AddToContainer(chipsx, 0 , 0)
	vm.CreateChip("c4", Me).AddClass("ma-2").SetText("Red Chip").SetTextColor("white").SetColor("red").AddToContainer(chipsx, 0 , 0)
	vm.CreateChip("c5", Me).AddClass("ma-2").SetText("Green Chip").SetTextColor("white").SetColor("green").AddToContainer(chipsx, 0 , 0)
	'
	vm.createchip("c6", Me).AddClass("ma-2").SetColor(vm.COLOR_INDIGO).SetTextColor(vm.COLOR_WHITE).SetIcon("mdi-account-circle", "left").SetText("Ranee").AddToContainer(chipsx, 0, 0)
	vm.createchip("c7", Me).AddClass("ma-2").SetColor(vm.COLOR_INDIGO).SetTextColor(vm.COLOR_WHITE).SetText("Premium").SetIcon("mdi-star", "right").AddToContainer(chipsx, 0, 0)
	vm.createchip("c8", Me).AddClass("ma-2").SetColor(vm.COLOR_TEAL).SetTextColor(vm.COLOR_WHITE).SetIcon("mdi-checkbox-marked-circle", "left").SetText("Confirm").SetClose(True).AddToContainer(chipsx, 0, 0)
	vm.createchip("c9", Me).AddClass("ma-2").SetColor(vm.COLOR_TEAL).SetCloseIcon("mdi-delete").SetTextColor(vm.COLOR_WHITE).SetIcon("mdi-checkbox-marked-circle", "left").SetText("TheMash").SetClose(True).AddToContainer(chipsx, 0, 0)
	vm.createchip("c10", Me).AddClass("ma-2").SetColor("success").SetIcon("mdi-server-plus", "left").SetOutlined(True).SetText("Server Status").AddToContainer(chipsx, 0, 0)
	vm.createchip("c11", Me).AddClass("ma-2").SetColor(vm.COLOR_PINK).SetTextColor(vm.COLOR_WHITE).SetIcon("mdi-label", "left").SetLabel(True).SetText("Tags").AddToContainer(chipsx, 0, 0)
	vm.createchip("c12", Me).AddClass("ma-2").SetColor(vm.COLOR_RED).SetTextColor(vm.COLOR_WHITE).SetText("Remove").SetClose(True).AddToContainer(chipsx, 0, 0)
	cont.AddComponent(1, 1, chipsx.ToString)

	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"vm.CreateChip("c1", Me).AddClass("ma-2").SetText("Default").AddToContainer(chipsx, 0 , 0)"$)
vue.AddCode($"vm.CreateChip("c2", Me).AddClass("ma-2").SetText("Primary").SetColor("primary").AddToContainer(chipsx, 0 , 0)"$)
vue.AddCode($"vm.CreateChip("c3", Me).AddClass("ma-2").SetText("Secondary").SetColor("secondary").AddToContainer(chipsx, 0 , 0)"$)
vue.AddCode($"vm.CreateChip("c4", Me).AddClass("ma-2").SetText("Red Chip").SetTextColor("white").SetColor("red").AddToContainer(chipsx, 0 , 0)"$)
vue.AddCode($"vm.CreateChip("c5", Me).AddClass("ma-2").SetText("Green Chip").SetTextColor("white").SetColor("green").AddToContainer(chipsx, 0 , 0)"$)
vue.AddCode($"'"$)
vue.AddCode($"vm.createchip("c6", Me).AddClass("ma-2").SetColor(vm.COLOR_INDIGO).SetTextColor(vm.COLOR_WHITE).SetIcon("mdi-account-circle", "left").SetText("Ranee").AddToContainer(chipsx, 0, 0)"$)
vue.AddCode($"vm.createchip("c7", Me).AddClass("ma-2").SetColor(vm.COLOR_INDIGO).SetTextColor(vm.COLOR_WHITE).SetText("Premium").SetIcon("mdi-star", "right").AddToContainer(chipsx, 0, 0)"$)
vue.AddCode($"vm.createchip("c8", Me).AddClass("ma-2").SetColor(vm.COLOR_TEAL).SetTextColor(vm.COLOR_WHITE).SetIcon("mdi-checkbox-marked-circle", "left").SetText("Confirm").SetClose(True).AddToContainer(chipsx, 0, 0)"$)
vue.AddCode($"vm.createchip("c9", Me).AddClass("ma-2").SetColor(vm.COLOR_TEAL).SetCloseIcon("mdi-delete").SetTextColor(vm.COLOR_WHITE).SetIcon("mdi-checkbox-marked-circle", "left").SetText("TheMash").SetClose(True).AddToContainer(chipsx, 0, 0)"$)
vue.AddCode($"vm.createchip("c10", Me).AddClass("ma-2").SetColor("success").SetIcon("mdi-server-plus", "left").SetOutlined(True).SetText("Server Status").AddToContainer(chipsx, 0, 0)"$)
vue.AddCode($"vm.createchip("c11", Me).AddClass("ma-2").SetColor(vm.COLOR_PINK).SetTextColor(vm.COLOR_WHITE).SetIcon("mdi-label", "left").SetLabel(True).SetText("Tags").AddToContainer(chipsx, 0, 0)"$)
vue.AddCode($"vm.createchip("c12", Me).AddClass("ma-2").SetColor(vm.COLOR_RED).SetTextColor(vm.COLOR_WHITE).SetText("Remove").SetClose(True).AddToContainer(chipsx, 0, 0)"$)
vue.AddCode($""$)
Main.CreateVBCode(vue, Me, "chipscode", "Chips", vue.GetSourceCode).AddToContainer(cont, 2, 1)
	
	'chip groups
	Dim cg As VMChipGroup = vm.CreateChipGroup("cg", Me).SetColumn(True).SetActiveClass(vm.COLOR_PRIMARY_TEXT)
	cg.AddItems(Array("Work", "Home Improvement", "Vacation", "Food", "Drawers"))
	cg.AddItems(Array("Shopping", "Art", "Tech", "Creative Writing"))
	cg.AddToContainer(cont, 3, 1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"'chip groups"$)
vue.AddCode($"Dim cg As VMChipGroup = vm.CreateChipGroup("cg", Me).SetColumn(True).SetActiveClass(vm.COLOR_PRIMARY_TEXT)"$)
vue.AddCode($"cg.AddItems(Array("Work", "Home Improvement", "Vacation", "Food", "Drawers"))"$)
vue.AddCode($"cg.AddItems(Array("Shopping", "Art", "Tech", "Creative Writing"))"$)
vue.AddCode($"cg.AddToContainer(cont, 3, 1)"$)
	Main.CreateVBCode(vue, Me, "chipgroup", "Chip Group", vue.GetSourceCode).AddToContainer(cont, 4, 1)

	Dim xcont As VMContainer = vm.CreateContainer("xcont", Me)
	xcont.AddRows(1).AddColumns4x3

	Dim product1 As VMCard = vm.CreateCard("product1", Me).AddClass("mx-auto").SetMaxWidth("auto")
	'** title add own heading
	product1.Title.AddElement("", "h2", "Toothbrush", Null, Null, Array("display-1"))
	product1.Title.AddSpacer
	product1.Title.AddElement("", "span", "$4.99", Null, Null, Array("title"))
	'** text
	product1.Text.SetText("Our company takes pride in making handmade brushes.")
	product1.Text.SetText("Our toothbrushes are available in 4 different bristel types, from extra soft To hard.")
	'** text after
	product1.SetTextAfterDivider("mx-4")
	'
	Dim vcardtext As VMCardText = vm.CreateCardText("", Me)
	'add a span
	vcardtext.AddElement("", "span", "Select Type", Null, Null, Array("subheading"))
	'
	Dim cg1 As VMChipGroup = vm.CreateChipGroup("", Me)
	cg1.SetVModel("selection").SetData("selection", 2).SetActiveClass("deep-purple--text text--accent-4").SetMandatory(True)
	cg1.AddItems(Array("Extra Soft", "Soft", "Medium", "Hard"))
	'add chip group to text
	vcardtext.SetText(cg1.ToString)
	product1.SetTextAfter(vcardtext.tostring)
	'
	Dim btnAdd2Cart As VMButton = vm.CreateButton("", Me)
	btnAdd2Cart.SetBlock(True)
	btnAdd2Cart.SetTextColor(vm.COLOR_WHITE)
	btnAdd2Cart.SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)
	btnAdd2Cart.SetLabel("Add to Cart")
	'
	product1.Actions.AddButton(btnAdd2Cart)
	product1.AddToContainer(xcont, 1, 1)
	'
	'***
	Dim shirtBlouse As VMCard = vm.CreateCard("shirtBlouse", Me).AddClass("mx-auto").SetMaxWidth("400")
	shirtBlouse.Title.AddElement("", "h2", "Shirt Blouse", Null, Null, Array("display-1"))
	shirtBlouse.Title.AddSpacer
	shirtBlouse.Title.AddElement("", "span", "$44.50", Null, Null, Array("title"))
	shirtBlouse.Text.SetText("Our blouses are available in 8 colors. You can custom order a built-in arch support For any of the models.")
	shirtBlouse.SetTextAfterDivider("mx-4")
	'
	Dim cardText1 As VMCardText = vm.CreateCardText("", Me)
	cardText1.AddElement("", "span", "Select Size", Null, Null, Array("subheading"))
	'
	Dim cg2 As VMChipGroup = vm.CreateChipGroup("cg2", Me).SetVmodel("cg2selection").SetData("cg2selection", "08").SetMandatory(True)
	cg2.SetActiveClass("deep-purple--text text--accent-4")
	cg2.AddItems(Array("04", "06", "08", "10", "12", "14"))
	'
	cardText1.SetText(cg2.ToString)
	shirtBlouse.SetTextAfter(cardText1.ToString)
	'
	Dim btnAdd2Cart1 As VMButton = vm.CreateButton("", Me)
	btnAdd2Cart1.SetBlock(True)
	btnAdd2Cart1.SetTextColor(vm.COLOR_WHITE)
	btnAdd2Cart1.SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)
	btnAdd2Cart1.SetLabel("Add to Cart")
	'
	shirtBlouse.Actions.AddButton(btnAdd2Cart1)
	shirtBlouse.AddToContainer(xcont, 1, 2)
	'
	'3rd card
	Dim card3 As VMElement = vm.VCard("card3").AddClass("mx-auto").SetMaxWidth("400")
	'
	Dim tbl1 As VMElement = vm.VToolBar("card2tbl1")
	tbl1.SetAttr(CreateMap("flat":True, "color":"deep-purple accent-4", "dark":True))
	'
	Dim btn1 As VMElement = vm.VBtn("").SetAttrSingle("icon", True).SetTextColor(vm.COLOR_WHITE)
	Dim icn As VMElement = vm.VIcon("").SetText("mdi-close")
	btn1.AddElement(icn)
	tbl1.AddElement(btn1)
	'
	Dim tt As VMElement = vm.VToolbarTitle("").SetText("Filter Results").SetTextColor(vm.COLOR_white)
	tbl1.AddElement(tt)
	card3.AddElement(tbl1)
	'
	Dim c3t1 As VMElement = vm.VCardText("")
	Dim c3t2 As VMElement = vm.VCardText("")
	'
	Dim h2 As VMElement = vm.H2("").AddClass("title mb-2").SetText("Choose amenities")
	c3t1.AddElement(h2)
	'
	Dim cg4 As VMElement = vm.VChipGroup("").SetVModel("amenities").SetAttrSingle("column", True).SetAttrSingle("multiple", True)
	Dim amenities As List = vm.NewList1(Array As Int(1, 4))
	cg4.SetData("amenities", amenities)
	cg4.AddElement1("v-chip", "", "Elevator", CreateMap("filter":True, "outlined":True), Null, Null, Null)
	cg4.AddElement1("v-chip", "", "Washer", CreateMap("filter":True, "outlined":True), Null, Null, Null)
	cg4.AddElement1("v-chip", "", "Fireplace", CreateMap("filter":True, "outlined":True), Null, Null, Null)
	cg4.AddElement1("v-chip", "", "Wheelchair", CreateMap("filter":True, "outlined":True), Null, Null, Null)
	cg4.AddElement1("v-chip", "", "Dogs ok", CreateMap("filter":True, "outlined":True), Null, Null, Null)
	cg4.AddElement1("v-chip", "", "Cats ok", CreateMap("filter":True, "outlined":True), Null, Null, Null)
	c3t1.AddElement(cg4)
	
	card3.AddElement(c3t1)
	'
	Dim h2a As VMElement = vm.H2("").AddClass("title mb-2").SetText("Choose neighborhoods")
	c3t2.AddElement(h2a)
	
	Dim cg5 As VMElement = vm.VChipGroup("").SetVModel("neighborhoods").SetAttrSingle("column", True).SetAttrSingle("multiple", True)
	Dim neighborhoods As List = vm.NewList1(Array As Int(1))
	cg5.SetData("neighborhoods", neighborhoods)
	cg5.AddElement1("v-chip", "", "Snowy Rock Place", CreateMap("filter":True, "outlined":True), Null, Null, Null)
	cg5.AddElement1("v-chip", "", "Honeylane Circle", CreateMap("filter":True, "outlined":True), Null, Null, Null)
	cg5.AddElement1("v-chip", "", "Donna Drive", CreateMap("filter":True, "outlined":True), Null, Null, Null)
	cg5.AddElement1("v-chip", "", "Elaine Street", CreateMap("filter":True, "outlined":True), Null, Null, Null)
	cg5.AddElement1("v-chip", "", "Court Street", CreateMap("filter":True, "outlined":True), Null, Null, Null)
	cg5.AddElement1("v-chip", "", "Kennedy Park", CreateMap("filter":True, "outlined":True), Null, Null, Null)
	c3t2.AddElement(cg5)
		
	card3.AddElement(c3t2)
	
	'add card to container
	card3.AddToContainer(xcont, 1, 3)
	'
	cont.AddComponent(5,1, xcont.tostring)
	
	
	
	
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim xcont As VMContainer = vm.CreateContainer("xcont", Me)"$)
vue.AddCode($"xcont.AddRows(1).AddColumns4x3"$)
vue.AddCode($""$)
vue.AddCode($"Dim product1 As VMCard = vm.CreateCard("product1", Me).AddClass("mx-auto").SetMaxWidth("auto")"$)
vue.AddCode($"'** title add own heading"$)
vue.AddCode($"product1.Title.AddElement("", "h2", "Toothbrush", Null, Null, Array("display-1"))"$)
vue.AddCode($"product1.Title.AddSpacer"$)
vue.AddCode($"product1.Title.AddElement("", "span", "~4.99", Null, Null, Array("title"))"$)
vue.AddCode($"'** text"$)
vue.AddCode($"product1.Text.SetText("Our company takes pride in making handmade brushes.")"$)
vue.AddCode($"product1.Text.SetText("Our toothbrushes are available in 4 different bristel types, from extra soft To hard.")"$)
vue.AddCode($"'** text after"$)
vue.AddCode($"product1.SetTextAfterDivider("mx-4")"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim vcardtext As VMCardText = vm.CreateCardText("", Me)"$)
vue.AddCode($"'add a span"$)
vue.AddCode($"vcardtext.AddElement("", "span", "Select Type", Null, Null, Array("subheading"))"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim cg1 As VMChipGroup = vm.CreateChipGroup("", Me)"$)
vue.AddCode($"cg1.SetVModel("selection").SetData("selection", 2).SetActiveClass("deep-purple--text text--accent-4").SetMandatory(True)"$)
vue.AddCode($"cg1.AddItems(Array("Extra Soft", "Soft", "Medium", "Hard"))"$)
vue.AddCode($"'add chip group to text"$)
vue.AddCode($"vcardtext.SetText(cg1.ToString)"$)
vue.AddCode($"product1.SetTextAfter(vcardtext.tostring)"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim btnAdd2Cart As VMButton = vm.CreateButton("", Me)"$)
vue.AddCode($"btnAdd2Cart.SetBlock(True)"$)
vue.AddCode($"btnAdd2Cart.SetTextColor(vm.COLOR_WHITE)"$)
vue.AddCode($"btnAdd2Cart.SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)"$)
vue.AddCode($"btnAdd2Cart.SetLabel("Add to Cart")"$)
vue.AddCode($"'"$)
vue.AddCode($"product1.Actions.AddButton(btnAdd2Cart)"$)
vue.AddCode($"product1.AddToContainer(xcont, 1, 1)"$)
vue.AddCode($"cont.AddComponent(5,1, xcont.tostring)"$)
Main.CreateVBCode(vue, Me, "toothbrush", "Tooth Brush", vue.GetSourceCode).AddToContainer(cont, 6, 1)
'

'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim shirtBlouse As VMCard = vm.CreateCard("shirtBlouse", Me).AddClass("mx-auto").SetMaxWidth("400")"$)
vue.AddCode($"shirtBlouse.Title.AddElement("", "h2", "Shirt Blouse", Null, Null, Array("display-1"))"$)
vue.AddCode($"shirtBlouse.Title.AddSpacer"$)
vue.AddCode($"shirtBlouse.Title.AddElement("", "span", "~44.50", Null, Null, Array("title"))"$)
vue.AddCode($"shirtBlouse.Text.SetText("Our blouses are available in 8 colors. You can custom order a built-in arch support For any of the models.")"$)
vue.AddCode($"shirtBlouse.SetTextAfterDivider("mx-4")"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim cardText1 As VMCardText = vm.CreateCardText("", Me)"$)
vue.AddCode($"cardText1.AddElement("", "span", "Select Size", Null, Null, Array("subheading"))"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim cg2 As VMChipGroup = vm.CreateChipGroup("cg2", Me).SetVmodel("cg2selection").SetData("cg2selection", "08").SetMandatory(True)"$)
vue.AddCode($"cg2.SetActiveClass("deep-purple--text text--accent-4")"$)
vue.AddCode($"cg2.AddItems(Array("04", "06", "08", "10", "12", "14"))"$)
vue.AddCode($"'"$)
vue.AddCode($"cardText1.SetText(cg2.ToString)"$)
vue.AddCode($"shirtBlouse.SetTextAfter(cardText1.ToString)"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim btnAdd2Cart1 As VMButton = vm.CreateButton("", Me)"$)
vue.AddCode($"btnAdd2Cart1.SetBlock(True)"$)
vue.AddCode($"btnAdd2Cart1.SetTextColor(vm.COLOR_WHITE)"$)
vue.AddCode($"btnAdd2Cart1.SetColorIntensity(vm.COLOR_DEEPPURPLE, vm.INTENSITY_ACCENT4)"$)
vue.AddCode($"btnAdd2Cart1.SetLabel("Add to Cart")"$)
vue.AddCode($"'"$)
vue.AddCode($"shirtBlouse.Actions.AddButton(btnAdd2Cart1)"$)
vue.AddCode($"shirtBlouse.AddToContainer(xcont, 1, 2)"$)
vue.AddCode($""$)
Main.CreateVBCode(vue, Me, "shblouse", "Shirt Blouse", vue.GetSourceCode).AddToContainer(cont, 7, 1)

'
'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"'3rd card"$)
vue.AddCode($"Dim card3 As VMElement = vm.VCard("card3").AddClass("mx-auto").SetMaxWidth("400")"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim tbl1 As VMElement = vm.VToolBar("card2tbl1")"$)
vue.AddCode($"tbl1.SetAttr(CreateMap("flat":True, "color":"deep-purple accent-4", "dark":True))"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim btn1 As VMElement = vm.VBtn("").SetAttrSingle("icon", True).SetTextColor(vm.COLOR_WHITE)"$)
vue.AddCode($"Dim icn As VMElement = vm.VIcon("").SetText("mdi-close")"$)
vue.AddCode($"btn1.AddElement(icn)"$)
vue.AddCode($"tbl1.AddElement(btn1)"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim tt As VMElement = vm.VToolbarTitle("").SetText("Filter Results").SetTextColor(vm.COLOR_white)"$)
vue.AddCode($"tbl1.AddElement(tt)"$)
vue.AddCode($"card3.AddElement(tbl1)"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim c3t1 As VMElement = vm.VCardText("")"$)
vue.AddCode($"Dim c3t2 As VMElement = vm.VCardText("")"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim h2 As VMElement = vm.H2("").AddClass("title mb-2").SetText("Choose amenities")"$)
vue.AddCode($"c3t1.AddElement(h2)"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim cg4 As VMElement = vm.VChipGroup("").SetVModel("amenities").SetAttrSingle("column", True).SetAttrSingle("multiple", True)"$)
vue.AddCode($"Dim amenities As List = vm.NewList1(Array As Int(1, 4))"$)
vue.AddCode($"cg4.SetData("amenities", amenities)"$)
vue.AddCode($"cg4.AddElement1("v-chip", "", "Elevator", CreateMap("filter":True, "outlined":True), Null, Null, Null)"$)
vue.AddCode($"cg4.AddElement1("v-chip", "", "Washer", CreateMap("filter":True, "outlined":True), Null, Null, Null)"$)
vue.AddCode($"cg4.AddElement1("v-chip", "", "Fireplace", CreateMap("filter":True, "outlined":True), Null, Null, Null)"$)
vue.AddCode($"cg4.AddElement1("v-chip", "", "Wheelchair", CreateMap("filter":True, "outlined":True), Null, Null, Null)"$)
vue.AddCode($"cg4.AddElement1("v-chip", "", "Dogs ok", CreateMap("filter":True, "outlined":True), Null, Null, Null)"$)
vue.AddCode($"cg4.AddElement1("v-chip", "", "Cats ok", CreateMap("filter":True, "outlined":True), Null, Null, Null)"$)
vue.AddCode($"c3t1.AddElement(cg4)"$)
vue.AddCode($""$)
vue.AddCode($"card3.AddElement(c3t1)"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim h2a As VMElement = vm.H2("").AddClass("title mb-2").SetText("Choose neighborhoods")"$)
vue.AddCode($"c3t2.AddElement(h2a)"$)
vue.AddCode($""$)
vue.AddCode($"Dim cg5 As VMElement = vm.VChipGroup("").SetVModel("neighborhoods").SetAttrSingle("column", True).SetAttrSingle("multiple", True)"$)
vue.AddCode($"Dim neighborhoods As List = vm.NewList1(Array As Int(1))"$)
vue.AddCode($"cg5.SetData("neighborhoods", neighborhoods)"$)
vue.AddCode($"cg5.AddElement1("v-chip", "", "Snowy Rock Place", CreateMap("filter":True, "outlined":True), Null, Null, Null)"$)
vue.AddCode($"cg5.AddElement1("v-chip", "", "Honeylane Circle", CreateMap("filter":True, "outlined":True), Null, Null, Null)"$)
vue.AddCode($"cg5.AddElement1("v-chip", "", "Donna Drive", CreateMap("filter":True, "outlined":True), Null, Null, Null)"$)
vue.AddCode($"cg5.AddElement1("v-chip", "", "Elaine Street", CreateMap("filter":True, "outlined":True), Null, Null, Null)"$)
vue.AddCode($"cg5.AddElement1("v-chip", "", "Court Street", CreateMap("filter":True, "outlined":True), Null, Null, Null)"$)
vue.AddCode($"cg5.AddElement1("v-chip", "", "Kennedy Park", CreateMap("filter":True, "outlined":True), Null, Null, Null)"$)
vue.AddCode($"c3t2.AddElement(cg5)"$)
vue.AddCode($""$)
vue.AddCode($"card3.AddElement(c3t2)"$)
vue.AddCode($""$)
vue.AddCode($"'add card to container"$)
vue.AddCode($"card3.AddToContainer(xcont, 1, 3)"$)
Main.CreateVBCode(vue, Me, "chipfilter", "Chip Group Filter ", vue.GetSourceCode).AddToContainer(cont, 8, 1)




'
	vm.AddContainer(cont)
End Sub


Sub chipfiltercopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("chipfilter")
End Sub

Sub chipfilterdownload_click(e As BANanoEvent)
	vue.DownloadCode("chipfilter", "chipfilter.txt")
End Sub


Sub shblousecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("shblouse")
End Sub

Sub shblousedownload_click(e As BANanoEvent)
	vue.DownloadCode("shblouse", "shblouse.txt")
End Sub


Sub toothbrushcopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("toothbrush")
End Sub

Sub toothbrushdownload_click(e As BANanoEvent)
	vue.DownloadCode("toothbrush", "toothbrush.txt")
End Sub



Sub chipgroupcopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("chipgroup")
End Sub

Sub chipgroupdownload_click(e As BANanoEvent)
	vue.DownloadCode("chipgroup", "chipgroup.txt")
End Sub



Sub chipscodecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("chipscode")
End Sub

Sub chipscodedownload_click(e As BANanoEvent)
vue.DownloadCode("chipscode", "chipscode.txt")
End Sub



Sub c10_click(e As BANanoEvent)
	vm.ShowSnackBar("Server status check!")
End Sub

Sub c12_close(e As BANanoEvent)
	vm.SetData("c12", False)
End Sub


Sub c8_close(e As BANanoEvent)
	BANano.Window.Alert("Close!")
End Sub
