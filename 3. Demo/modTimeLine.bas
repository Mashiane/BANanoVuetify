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
End Sub


Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	cont.AddRows(1).AddColumns12
	'hide this container
	cont.Hide
	'
	Dim tltimeline1 As VMTimeline
	tltimeline1.Initialize(vue, "tltimeline1", Me)
	tltimeline1.SetReverse(True)
	tltimeline1.SetVisible(True)
	'add each item
	Dim tlItemfirstname As VMTimelineItem
	tlItemfirstname.Initialize(vue, "tlItemfirstname", Me)
	tlItemfirstname.SetColorintensity("brown","")
	tlItemfirstname.SetLarge(True)
	tlItemfirstname.SetVisible(True)
	tlItemfirstname.SetAvatar("./assets/sponge.png")
	tlItemfirstname.OppositeText.SetText("Anele")
	tltimeline1.AddComponent(tlItemfirstname.tostring)

	Dim tlItemsurname As VMTimelineItem
	tlItemsurname.Initialize(vue, "tlItemsurname", Me)
	tlItemsurname.SetFilldot(True)
	tlItemsurname.SetIcon("mdi-plus")
	tlItemsurname.SetSmall(True)
	tlItemsurname.SetVisible(True)
	tlItemsurname.OppositeText.SetText("Mbanga")
	tltimeline1.AddComponent(tlItemsurname.tostring)
	tltimeline1.AddToContainer(cont,1,1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim tltimeline1 As VMTimeline"$)
vue.AddCode($"tltimeline1.Initialize(vue, "tltimeline1", Me)"$)
vue.AddCode($"tltimeline1.SetReverse(True)"$)
vue.AddCode($"tltimeline1.SetVisible(True)"$)
vue.AddCode($"'add each item"$)
vue.AddCode($"Dim tlItemfirstname As VMTimelineItem"$)
vue.AddCode($"tlItemfirstname.Initialize(vue, "tlItemfirstname", Me)"$)
vue.AddCode($"tlItemfirstname.SetColorintensity("brown","")"$)
vue.AddCode($"tlItemfirstname.SetLarge(True)"$)
vue.AddCode($"tlItemfirstname.SetVisible(True)"$)
vue.AddCode($"tlItemfirstname.SetAvatar("./assets/sponge.png")"$)
vue.AddCode($"tlItemfirstname.OppositeText.SetText("Anele")"$)
vue.AddCode($"tltimeline1.AddComponent(tlItemfirstname.tostring)"$)
vue.AddCode($""$)
vue.AddCode($"Dim tlItemsurname As VMTimelineItem"$)
vue.AddCode($"tlItemsurname.Initialize(vue, "tlItemsurname", Me)"$)
vue.AddCode($"tlItemsurname.SetFilldot(True)"$)
vue.AddCode($"tlItemsurname.SetIcon("mdi-plus")"$)
vue.AddCode($"tlItemsurname.SetSmall(True)"$)
vue.AddCode($"tlItemsurname.SetVisible(True)"$)
vue.AddCode($"tlItemsurname.OppositeText.SetText("Mbanga")"$)
vue.AddCode($"tltimeline1.AddComponent(tlItemsurname.tostring)"$)
vue.AddCode($"tltimeline1.AddToContainer(cont,1,1)"$)
Main.CreateVBCode(vue, Me, "timeline1code", "Timeline", vue.GetSourceCode).AddToContainer(cont, 1, 1)


	'add container to page
	vm.AddContainer(cont)
End Sub



Sub timeline1codecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("timeline1code")
End Sub

Sub timeline1codedownload_click(e As BANanoEvent)
	vue.DownloadCode("timeline1code", "timeline1code.txt")
End Sub
  