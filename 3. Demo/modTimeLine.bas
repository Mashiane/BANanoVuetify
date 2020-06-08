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

	cont.AddControl(tltimeline1.TimeLine, tltimeline1.tostring, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)
	
	'add container to page
	vm.AddContainer(cont)
End Sub


  