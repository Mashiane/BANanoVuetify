B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "itemgroupsCode"
	Public title As String = "Item Groups"
	Private vm As BANanoVM
	Private vue As BANanoVue
	Private BANano As BANano
End Sub

Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(5).AddColumns12
	'
	Dim ig As VMItemGroup = vm.CreateItemGroup("ig", Me)
	ig.Container.AddRows(1).AddColumns(3, 12, 4, 4, 4)
	'
	Dim item As VMItem = vm.CreateItem("", Me).SetActiveToggle
	'
	Dim card As VMCard = vm.CreateCard("itemcard", Me)
	card.SetAttrSingle(":color", "active ? 'primary' : ''")
	card.AddClass("d-flex align-center")
	card.SetDark(True)
	card.SetHeight(200)
	card.SetAttrSingle("@click", "toggle")
	'
	Dim syt As VMScrollYTransition
	syt.Initialize(vue, "", Me)
	syt.AddElement1("", "div", "Active", CreateMap("v-if" :"active"), Null, Array("display-3 flex-grow-1 text-center"))
	card.SetTextAfter(syt.tostring)
	
	'add the card to the item
	item.AddComponent(card.tostring)
	'
	Dim eachItem As String = item.tostring
	ig.Container.AddComponent(1,1, eachItem)
	ig.Container.AddComponent(1,2, eachItem)
	ig.Container.AddComponent(1,3, eachItem)	
	'
	ig.AddToContainer(cont, 1, 1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim ig As VMItemGroup = vm.CreateItemGroup("ig", Me)"$)
vue.AddCode($"ig.Container.AddRows(1).AddColumns(3, 12, 4, 4, 4)"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim item As VMItem = vm.CreateItem("", Me).SetActiveToggle"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim card As VMCard = vm.CreateCard("itemcard", Me)"$)
vue.AddCode($"card.SetAttrSingle(":color", "active ? 'primary' : ''")"$)
vue.AddCode($"card.AddClass("d-flex align-center")"$)
vue.AddCode($"card.SetDark(True)"$)
vue.AddCode($"card.SetHeight(200)"$)
vue.AddCode($"card.SetAttrSingle("@click", "toggle")"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim syt As VMScrollYTransition"$)
vue.AddCode($"syt.Initialize(vue, "", Me)"$)
vue.AddCode($"syt.AddElement("", "div", "Active", CreateMap("v-if" :"active"), Null, Array("display-3 flex-grow-1 text-center"))"$)
vue.AddCode($"card.SetTextAfter(syt.tostring)"$)
vue.AddCode($""$)
vue.AddCode($"'add the card to the item"$)
vue.AddCode($"item.AddComponent(card.tostring)"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim eachItem As String = item.tostring"$)
vue.AddCode($"ig.Container.AddComponent(1,1, eachItem)"$)
vue.AddCode($"ig.Container.AddComponent(1,2, eachItem)"$)
vue.AddCode($"ig.Container.AddComponent(1,3, eachItem)"$)
vue.AddCode($"'"$)
vue.AddCode($"ig.AddToContainer(cont, 1, 1)"$)
pgIndex.CreateVBCode(vue, Me, "igcore", "Item Group", vue.GetSourceCode).AddToContainer(cont, 2, 1)
'
'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Sub ig_change(values As List)"$)
vue.AddCode($"vm.ShowSnackBarSuccess(BANano.tojson(values))"$)
vue.AddCode($"End Sub"$)
pgIndex.CreateVBCode(vue, Me, "ige", "Item Group Event", vue.GetSourceCode).AddToContainer(cont, 3, 1)
'
	'create a color picker
'	Dim colorpicker As VMItemGroup = vm.CreateItemGroup("colorpicker", Me)
'	colorpicker.setvmodel("color")
'	vue.setdata("color", "colors[0]")
'	colorpicker.setmandatory(True)
'	colorpicker.Container.AddRows(1).AddColumns12
'	Dim colors As List = vue.newlist
'	colors.add(Array As String("#ffc107"))
'	colors.add(Array As String("#000000"))
'	colors.add(Array As String("#2196f3"))
'	colors.add(Array As String("#607d8b"))
'	colors.add(Array As String("#795548"))
'	colors.add(Array As String("#00bcd4"))
'	colors.add(Array As String("#ff5722"))
'	colors.add(Array As String("#673ab7"))
'	colors.add(Array As String("#4caf50"))
'	colors.add(Array As String("#9e9e9e"))
'	colors.add(Array As String("#3f51b5"))
'	colors.add(Array As String("#03a9f4"))
'	colors.add(Array As String("#8bc34a"))
'	colors.add(Array As String("#cddc39"))
'	colors.add(Array As String("#ff9800"))
'	colors.add(Array As String("#f44336"))
'	colors.add(Array As String("#9c27b0"))
'	colors.add(Array As String("#f44336"))
'	colors.add(Array As String("#009688"))
'	colors.add(Array As String("#ffffff"))
'	colors.add(Array As String("#ffeb3b"))
'	vue.setdata("colors", colors)
'	'
'	Dim color As VMItem = vm.CreateItem("eachcolor", Me)
'	color.setvfor("(color, i)", "colors")
'	color.SetAttrSingle(":key", "i")
'	color.SetActiveToggle
'	color.SetAttrSingle(":value", "color")
'	'
'	Dim colorStyle As Map = CreateMap()
'	colorStyle.put("borderColor", "active ? '#222' : 'white'")
'	colorStyle.put("border", "2px solid")
'	colorStyle.put("background", "color.length > 1	? `linear-gradient(0deg, ${color})`	: color[0]")
'	vue.setdata("colorstyle", colorStyle)
'	Dim card As VMCard = vm.CreateCard("colorcard", Me)
'	card.SetAttrSingle(":color", "active ? 'primary' : ''")
'	card.setAttrSingle(":style", "colorstyle")
'	card.setwidth("30")
'	card.setheight("30")
'	card.addclass("mr-2")
'	card.SetAttrSingle("@click.native", "toggle")
'	'add the card to the item
'	color.AddComponent(card.tostring)
'	'add color to item group
'	colorpicker.Container.AddComponent(1,1, color.tostring)
'		
'	'add to container
'	colorpicker.AddToContainer(cont, 4, 1)

	vm.AddContainer(cont)
End Sub


Sub igecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("ige")
End Sub

Sub igedownload_click(e As BANanoEvent)
	vue.DownloadCode("ige", "ige.txt")
End Sub


Sub ig_change(values As List)
	vm.ShowSnackBarSuccess(BANano.tojson(values))
End Sub

Sub igcorecopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("igcore")
End Sub

Sub igcoredownload_click(e As BANanoEvent)
vue.DownloadCode("igcore", "igcore.txt")
End Sub


