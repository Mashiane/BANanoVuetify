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
	
	Dim sheet As VMSheet = vm.CreateSheet("", Me).AddClass("mx-auto").SetMaxWidth("700")
	Dim sg As VMSlideGroup = vm.CreateSlideGroup("slidegroup", Me).SetMultiple(True).SetShowArrows(True)
	Dim si As VMSlideItem = vm.CreateSlideItem("", Me).SetVFor("n", "25").SetAttrSingle(":key", "n").SetActiveToggle
	'
	Dim btn  As VMElement = vm.VBtn("").AddClass("mx-2").SetAttrSingle(":input-value", "active")
	btn.SetActiveClass("purple white--text").SetAttrSIngle("depressed", True).SetAttrSingle("rounded", True)
	btn.SetAttrSingle("@click", "toggle").SetText("{{ n }}")
	'
	si.AddComponent(btn.ToString)
	sg.AddComponent(si.ToString)
	sheet.AddComponent(sg.tostring)
	sheet.AddToContainer(cont, 1, 1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim sheet As VMSheet = vm.CreateSheet("", Me).AddClass("mx-auto").SetMaxWidth("700")"$)
vue.AddCode($"Dim sg As VMSlideGroup = vm.CreateSlideGroup("slidegroup", Me).SetMultiple(True).SetShowArrows(True)"$)
vue.AddCode($"Dim si As VMSlideItem = vm.CreateSlideItem("", Me).SetVFor("n", "25").SetAttrSingle(":key", "n").SetActiveToggle"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim btn  As VMElement = vm.VBtn("").AddClass("mx-2").SetAttrSingle(":input-value", "active")"$)
vue.AddCode($"btn.SetActiveClass("purple white--text").SetAttrSIngle("depressed", True).SetAttrSingle("rounded", True)"$)
vue.AddCode($"btn.SetAttrSingle("@click", "toggle").SetText("{{ n }}")"$)
vue.AddCode($"'"$)
vue.AddCode($"si.AddComponent(btn.ToString)"$)
vue.AddCode($"sg.AddComponent(si.ToString)"$)
vue.AddCode($"sheet.AddComponent(sg.tostring)"$)
vue.AddCode($"sheet.AddToContainer(cont, 1, 1)"$)
vue.AddCode($""$)
pgIndex.CreateVBCode(vue, Me, "slideg1", "Slide Group", vue.GetSourceCode).AddToContainer(cont, 2, 1)

	
	Dim sheet1 As VMSheet = vm.CreateSheet("", Me).SetElevation(8).AddClass("mx-auto").SetMaxWidth("800")
	Dim sg1 As VMSlideGroup = vm.CreateSlideGroup("slidegroup1", Me).SetCenterActive(True).SetShowArrows(True).SetVModel("modelx").SetData("modelx", Null)
	sg1.AddClass("pa-4")
	Dim si1 As VMSlideItem = vm.CreateSlideItem("", Me).SetVFor("n", "15").SetAttrSingle(":key", "n").SetActiveToggle
	'
	Dim vcard As VMCard = vm.CreateCard("", Me)
	vcard.SetAttrSingle(":color", "active ? 'primary' : 'grey lighten-1'")
	vcard.AddClass("ma-4").SetHeight(200).SetWidth(100).SetAttrSingle("@click", "toggle")
	vcard.Container.AddRows(1).AddColumns12
	vcard.Container.SetClassRC(1,0,"fill-height")
	vcard.Container.SetAlignRC(1,0, "center")
	vcard.Container.SetJustifyRC(1,0, "center")
	'
	Dim st As VMScaleTransition
	st.Initialize(vue, "", Me)
	st.AddElement("", "v-icon", "mdi-close-circle-outline", CreateMap("v-if":"active","color":"white","size":48), Null, Null)
	vcard.Container.AddComponent(1,1, st.ToString)
	
	si1.AddComponent(vcard.ToString)
	sg1.AddComponent(si1.ToString)
	sheet1.AddComponent(sg1.tostring)
	sheet1.AddToContainer(cont, 3, 1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim sheet1 As VMSheet = vm.CreateSheet("", Me).SetElevation(8).AddClass("mx-auto").SetMaxWidth("800")"$)
vue.AddCode($"Dim sg1 As VMSlideGroup = vm.CreateSlideGroup("slidegroup1", Me).SetCenterActive(True).SetShowArrows(True).SetVModel("modelx").SetData("modelx", Null)"$)
vue.AddCode($"sg1.AddClass("pa-4")"$)
vue.AddCode($"Dim si1 As VMSlideItem = vm.CreateSlideItem("", Me).SetVFor("n", "15").SetAttrSingle(":key", "n").SetActiveToggle"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim vcard As VMCard = vm.CreateCard("", Me)"$)
vue.AddCode($"vcard.SetAttrSingle(":color", "active ? 'primary' : 'grey lighten-1'")"$)
vue.AddCode($"vcard.AddClass("ma-4").SetHeight(200).SetWidth(100).SetAttrSingle("@click", "toggle")"$)
vue.AddCode($"vcard.Container.AddRows(1).AddColumns12"$)
vue.AddCode($"vcard.Container.SetClassRC(1,0,"fill-height")"$)
vue.AddCode($"vcard.Container.SetAlignRC(1,0, "center")"$)
vue.AddCode($"vcard.Container.SetJustifyRC(1,0, "center")"$)
vue.AddCode($"'"$)
vue.AddCode($"Dim st As VMScaleTransition"$)
vue.AddCode($"st.Initialize(vue, "", Me)"$)
vue.AddCode($"st.AddElement("", "v-icon", "mdi-close-circle-outline", CreateMap("v-if":"active","color":"white","size":48), Null, Null)"$)
vue.AddCode($"vcard.Container.AddComponent(1,1, st.ToString)"$)
vue.AddCode($""$)
vue.AddCode($"si1.AddComponent(vcard.ToString)"$)
vue.AddCode($"sg1.AddComponent(si1.ToString)"$)
vue.AddCode($"sheet1.AddComponent(sg1.tostring)"$)
vue.AddCode($"sheet1.AddToContainer(cont, 3, 1)"$)
vue.AddCode($""$)
pgIndex.CreateVBCode(vue, Me, "slideg2", "Slide Group Card", vue.GetSourceCode).AddToContainer(cont, 4, 1)
'
'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Sub slidegroup1_change(value As List)"$)
vue.AddCode($"vm.ShowSnackBarSuccess(BANano.ToJson(value))"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($""$)
vue.AddCode($"Sub slidegroup_change(value As List)"$)
vue.AddCode($"vm.ShowSnackBarSuccess(BANano.ToJson(value))"$)
vue.AddCode($"End Sub"$)
pgIndex.CreateVBCode(vue, Me, "slideg2eve", "Slide Group Change Event", vue.GetSourceCode).AddToContainer(cont, 5, 1)

	 
	vm.AddContainer(cont)
End Sub


Sub slideg2evecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("slideg2eve")
End Sub

Sub slideg2evedownload_click(e As BANanoEvent)
	vue.DownloadCode("slideg2eve", "slideg2eve.txt")
End Sub




Sub slideg2copy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("slideg2")
End Sub

Sub slideg2download_click(e As BANanoEvent)
vue.DownloadCode("slideg2", "slideg2.txt")
End Sub



Sub slideg1copy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("slideg1")
End Sub

Sub slideg1download_click(e As BANanoEvent)
	vue.DownloadCode("slideg1", "slideg1.txt")
End Sub



Sub slidegroup1_change(value As List)
	vm.ShowSnackBarSuccess(BANano.ToJson(value))
End Sub


Sub slidegroup_change(value As List)
	vm.ShowSnackBarSuccess(BANano.ToJson(value))
End Sub