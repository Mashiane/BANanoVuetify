B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Public name As String = "simpleTableCode"
	Public title As String = "Simple Table"
	Private vm As BANanoVM
	Private BANano As BANano  'ignore
	Private st As VMSimpleTable
	Private vue As BANanoVue
End Sub

Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'
	cont.AddRows(5).AddColumns12
	
	'use on code
	st.Initialize(vue, "st1", "name", Me)
	st.SetFixedHeader(True)
	st.SetHeight("400px")
	st.AddColumn("name", "Name")
	st.AddColumn("calories", "Calories")
	st.SetDark(True)
	st.AddRow(CreateMap("name": "Frozen Yogurt", "calories": 159))
	st.AddRow(CreateMap("name": "Ice cream sandwich", "calories": 237))
	st.AddRow(CreateMap("name": "Eclair", "calories": 262))
	st.AddRow(CreateMap("name": "Cupcake", "calories": 305))
	st.AddRow(CreateMap("name": "Gingerbread", "calories": 356))
	st.AddRow(CreateMap("name": "Jelly bean", "calories": 375))
	st.AddRow(CreateMap("name": "Lollipop", "calories": 392))
	st.AddRow(CreateMap("name": "Honeycomb", "calories": 408))
	st.AddRow(CreateMap("name": "Donut", "calories": 452))
	st.AddRow(CreateMap("name": "KitKat", "calories": 518))
	'add to parent component
	cont.AddComponent(1,1, st.tostring)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"'define in process_blobals"$)
vue.AddCode($"Private st As VMSimpleTable"$)
vue.AddCode($""$)
vue.AddCode($"'use on code"$)
vue.AddCode($"st.Initialize(vue, "st1", "name", Me)"$)
vue.AddCode($"st.SetFixedHeader(True)"$)
vue.AddCode($"st.SetHeight("400px")"$)
vue.AddCode($"st.AddColumn("name", "Name")"$)
vue.AddCode($"st.AddColumn("calories", "Calories")"$)
vue.AddCode($"st.SetDark(True)"$)
vue.AddCode($"st.AddRow(CreateMap("name": "Frozen Yogurt", "calories": 159))"$)
vue.AddCode($"st.AddRow(CreateMap("name": "Ice cream sandwich", "calories": 237))"$)
vue.AddCode($"st.AddRow(CreateMap("name": "Eclair", "calories": 262))"$)
vue.AddCode($"st.AddRow(CreateMap("name": "Cupcake", "calories": 305))"$)
vue.AddCode($"st.AddRow(CreateMap("name": "Gingerbread", "calories": 356))"$)
vue.AddCode($"st.AddRow(CreateMap("name": "Jelly bean", "calories": 375))"$)
vue.AddCode($"st.AddRow(CreateMap("name": "Lollipop", "calories": 392))"$)
vue.AddCode($"st.AddRow(CreateMap("name": "Honeycomb", "calories": 408))"$)
vue.AddCode($"st.AddRow(CreateMap("name": "Donut", "calories": 452))"$)
vue.AddCode($"st.AddRow(CreateMap("name": "KitKat", "calories": 518))"$)
vue.AddCode($"'add to parent component"$)
vue.AddCode($"cont.AddComponent(1,1, st.tostring)"$)
pgIndex.CreateVBCode(vue, Me, "simptab", "Simple Tab", vue.GetSourceCode).AddToContainer(cont, 2, 1)
	
	'add container to page
	vm.AddContainer(cont)
End Sub


Sub simptabcopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("simptab")
End Sub

Sub simptabdownload_click(e As BANanoEvent)
	vue.DownloadCode("simptab", "simptab.txt")
End Sub


	


