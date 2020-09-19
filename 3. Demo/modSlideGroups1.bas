B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "slidegroupsCode"
	Public title As String = "Slide Groups"
	Private vm As BANanoVM
	Private vue As BANanoVue
End Sub

Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns12
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
	syt.AddElement("", "div", "Active", CreateMap("v-if" :"active"), Null, Array("display-3 flex-grow-1 text-center"))
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

	vm.AddContainer(cont)
End Sub


Sub igcorecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("igcore")
End Sub

Sub igcoredownload_click(e As BANanoEvent)
	vue.DownloadCode("igcore", "igcore.txt")
End Sub


