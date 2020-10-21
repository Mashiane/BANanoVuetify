B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "textfieldCode"
	Public title As String = "Text Field"
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
	cont.addrows(15).AddColumns8
	'
	Dim mytxt As VMTextField = vm.CreateTextField("t1", Me).SetLabel("Regular").SetHint("Enter a name").SetPersistentHint(True)
	mytxt.SetPrependIcon("place")
	mytxt.SetPrependInnerIcon("mdi-account-circle-outline")
	mytxt.SetAppendIcon("mdi-caravan")
	mytxt.SetAppendOuterIcon("mdi-map-marker-radius")
	mytxt.SetSingleLine(True).SetClearable(True).SetMaxLength(25)
	mytxt.SetVModel("t1data")
	'
	'events
	mytxt.SetOnKeydown(Me, "t1_keydown")
	mytxt.SetOnClickAppend(Me, "t1append_click")
	mytxt.SetOnClickAppendOuter(Me, "t1appendouter_click")
	mytxt.SetOnClickPrepend(Me, "t1prepend_click")
	mytxt.SetOnClickPrependInner(Me, "t1prependinner_click")
	mytxt.SetOnClickClear(Me, "t1_clear")
	' button after
	Dim btnAfter As VMButton = vm.CreateButton("t1after", Me).SetColor(vm.COLOR_ORANGE).SetIconButton("mdi-thumb-up")
	mytxt.AddButtonAfter(btnAfter)
	
	mytxt.AddToContainer(cont, 1, 1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim mytxt As VMTextField = vm.CreateTextField("t1", Me).SetLabel("Regular").SetHint("Enter a name").SetPersistentHint(True)"$)
vue.AddCode($"mytxt.SetPrependIcon("place")"$)
vue.AddCode($"mytxt.SetPrependInnerIcon("mdi-account-circle-outline")"$)
vue.AddCode($"mytxt.SetAppendIcon("mdi-caravan")"$)
vue.AddCode($"mytxt.SetAppendOuterIcon("mdi-map-marker-radius")"$)
vue.AddCode($"mytxt.SetSingleLine(True).SetClearable(True).SetMaxLength(25)"$)
vue.AddCode($"mytxt.SetVModel("t1data")"$)
vue.AddCode($"'"$)
vue.AddCode($"'events"$)
vue.AddCode($"mytxt.SetOnKeydown(Me, "t1_keydown")"$)
vue.AddCode($"mytxt.SetOnClickAppend(Me, "t1append_click")"$)
vue.AddCode($"mytxt.SetOnClickAppendOuter(Me, "t1appendouter_click")"$)
vue.AddCode($"mytxt.SetOnClickPrepend(Me, "t1prepend_click")"$)
vue.AddCode($"mytxt.SetOnClickPrependInner(Me, "t1prependinner_click")"$)
vue.AddCode($"mytxt.SetOnClickClear(Me, "t1_clear")"$)
vue.AddCode($"' button after"$)
vue.AddCode($"Dim btnAfter As VMButton = vm.CreateButton("t1after", Me).SetColor(vm.COLOR_ORANGE).SetIconButton("mdi-thumb-up")"$)
vue.AddCode($"mytxt.AddButtonAfter(btnAfter)"$)
vue.AddCode($""$)
vue.AddCode($"mytxt.AddToContainer(cont, 1, 1)"$)
vue.AddCode($""$)
pgIndex.CreateVBCode(vue, Me, "t1cc", "Text Field", vue.GetSourceCode).AddToContainer(cont, 2, 1)
'
'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($""$)
vue.AddCode($"Sub t1after_click(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowSnackBarSuccess("Clicked Button After Text Field!")"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub t1_clear(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowSnackBar("t1 clear")"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($""$)
vue.AddCode($"Sub t1_keydown(e As BANanoEvent)"$)
vue.AddCode($"vm.NavBar.UpdateTitle("t1 keydown...")"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub t1append_click(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowSnackBar("append click")"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub t1appendouter_click(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowSnackBar("append-outer click")"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub t1prepend_click(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowSnackBar("prepend click")"$)
vue.AddCode($""$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub t1prependinner_click(e As BANanoEvent)"$)
vue.AddCode($"vm.ShowSnackBar("prepend-inner click")"$)
vue.AddCode($"End Sub"$)
pgIndex.CreateVBCode(vue, Me, "t1eve", "Text Field Events", vue.GetSourceCode).AddToContainer(cont, 3, 1)
	
	'add a menu after
	Dim menuAfter As VMMenu
	menuAfter = vm.CreateMenu("menuAfter", Me)
	menuAfter.SetIconColor("mdi-dots-vertical", vm.color_green)
	menuAfter.AddKeyValue("day", "Day")
	menuAfter.AddKeyValue("week", "Week")
	menuAfter.AddKeyValue("month", "Month")
	'
	vm.CreateTextField("t2", Me).SetLabel("Solo").SetPlaceholder("Text fields").SetPrependInnerIcon("place").SetSolo(True).SetClearable(True).SetCounter(25).AddMenuAfter(menuAfter).AddToContainer(cont, 4, 1)
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"'add a menu after"$)
vue.AddCode($"Dim menuAfter As VMMenu"$)
vue.AddCode($"menuAfter = vm.CreateMenu("menuAfter", Me)"$)
vue.AddCode($"menuAfter.SetIconColor("mdi-dots-vertical", vm.color_green)"$)
vue.AddCode($"menuAfter.AddKeyValue("day", "Day")"$)
vue.AddCode($"menuAfter.AddKeyValue("week", "Week")"$)
vue.AddCode($"menuAfter.AddKeyValue("month", "Month")"$)
vue.AddCode($"'"$)
vue.AddCode($"vm.CreateTextField("t2", Me).SetLabel("Solo").SetPlaceholder("Text fields").SetPrependInnerIcon("place").SetSolo(True).SetClearable(True).SetCounter(25).AddMenuAfter(menuAfter).AddToContainer(cont, 4, 1)"$)
pgIndex.CreateVBCode(vue, Me, "textafter", "Menu After", vue.GetSourceCode).AddToContainer(cont, 4, 1)

	Dim t3 As VMTextField = vm.CreateTextField("t3", Me).SetCalculator.SetFab(True).SetPrecision(2).SetUseGrouping(True)
	t3.SetPrefix("$").SetLabel("Calculator").SetAppendIcon("place")
	t3.AddToContainer(cont, 5, 1)
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim t3 As VMTextField = vm.CreateTextField("t3", Me).SetCalculator.SetFab(True).SetPrecision(2).SetUseGrouping(True)"$)
vue.AddCode($"t3.SetPrefix("~").SetLabel("Calculator").SetAppendIcon("place")"$)
vue.AddCode($"t3.AddToContainer(cont, 5, 1)"$)
pgIndex.CreateVBCode(vue, Me, "calcit", "Calculator", vue.GetSourceCode).AddToContainer(cont, 5, 1)
	
	vm.CreateTextField("t4", Me).SetLabel("Outline").SetPrefix("$").SetAppendOuterIcon("place").SetValue("10").Setoutlined(True).SetClearable(True).AddToContainer(cont, 6, 1)
	'initialize code builder
	'
vue.SourceCodeBuilder
vue.AddCode($"vm.CreateTextField("t4", Me).SetLabel("Outline").SetPrefix("~").SetAppendOuterIcon("place").SetValue("10").Setoutlined(True).SetClearable(True).AddToContainer(cont, 6, 1)"$)
pgIndex.CreateVBCode(vue, Me, "outline", "Outline", vue.GetSourceCode).AddToContainer(cont, 6, 1)


	vm.CreateTextField("t5", Me).SetVModel("firstname").SetLabel("Filled Shaped").SetCounter(25).SetClearable(True).SetShaped(True).SetFilled(True).AddToContainer(cont, 7, 1)
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"vm.CreateTextField("t5", Me).SetVModel("firstname").SetLabel("Filled Shaped").SetCounter(25).SetClearable(True).SetShaped(True).SetFilled(True).AddToContainer(cont, 7, 1)"$)
pgIndex.CreateVBCode(vue, Me, "filledtxt", "Filled", vue.GetSourceCode).AddToContainer(cont, 7, 1)

	vm.CreateTextField("t6", Me).SetVModel("lastname").SetSuffix("@gmail.com").SetLabel("Outline Shaped").SetClearable(True).SetShaped(True).SetOutlined(True).AddToContainer(cont, 8, 1)
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"vm.CreateTextField("t6", Me).SetVModel("lastname").SetSuffix("@gmail.com").SetLabel("Outline Shaped").SetClearable(True).SetShaped(True).SetOutlined(True).AddToContainer(cont, 8, 1)"$)
pgIndex.CreateVBCode(vue, Me, "shapedtxt", "Shaped", vue.GetSourceCode).AddToContainer(cont, 8, 1)


	vm.CreateTextField("p1", Me).SetLabel("Password").SetPassword(True,True).SetName("password",False).SetHint("At least enter 8 characters.").SetCounter(8).AddToContainer(cont, 9, 1)
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"vm.CreateTextField("p1", Me).SetLabel("Password").SetPassword(True,True).SetName("password",False).SetHint("At least enter 8 characters.").SetCounter(8).AddToContainer(cont, 9, 1)"$)
pgIndex.CreateVBCode(vue, Me, "passtxt", "Password", vue.GetSourceCode).AddToContainer(cont, 9, 1)
	
	Dim txtn1 As VMTextField = vm.CreateTextField("n1", Me).SetVModel("n1x").SetReadOnly(True)
	txtn1.SetLabel("Number")
	txtn1.AddDecrementIcon(vm.color_red)
	txtn1.AddIncrementIcon(vm.color_green)
	txtn1.AddToContainer(cont, 10, 1)

'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Dim txtn1 As VMTextField = vm.CreateTextField("n1", Me).SetVModel("n1x").SetReadOnly(True)"$)
vue.AddCode($"txtn1.SetLabel("Number")"$)
vue.AddCode($"txtn1.AddDecrementIcon(vm.color_red)"$)
vue.AddCode($"txtn1.AddIncrementIcon(vm.color_green)"$)
vue.AddCode($"txtn1.AddToContainer(cont, 10, 1)"$)
pgIndex.CreateVBCode(vue, Me, "decinc", "Increment / Decrement", vue.GetSourceCode).AddToContainer(cont, 10, 1)
'
'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"Sub n1increment_click(e As BANanoEvent)"$)
vue.AddCode($"vm.Increment("n1x", 1)"$)
vue.AddCode($"End Sub"$)
vue.AddCode($""$)
vue.AddCode($"Sub n1decrement_click(e As BANanoEvent)"$)
vue.AddCode($"vm.Decrement("n1x", 1)"$)
vue.AddCode($"End Sub"$)
pgIndex.CreateVBCode(vue, Me, "decince", "Increment / Decrement Events", vue.GetSourceCode).AddToContainer(cont, 10, 1)

	' add color picker
	Dim tcolor As VMTextField = vm.CreateTextField("tcolor", Me).SetLabel("Color Picker").SetVModel("mycolor")
	tcolor.AddColorPicker
	tcolor.AddToContainer(cont, 11, 1)
	'
	'initialize code builder
vue.SourceCodeBuilder
vue.AddCode($"' add color picker"$)
vue.AddCode($"Dim tcolor As VMTextField = vm.CreateTextField("tcolor", Me).SetLabel("Color Picker").SetVModel("mycolor")"$)
vue.AddCode($"tcolor.AddColorPicker"$)
vue.AddCode($"tcolor.AddToContainer(cont, 11, 1)"$)
vue.AddCode($"'"$)
pgIndex.CreateVBCode(vue, Me, "txtcolor", "Textfield Color Picker", vue.GetSourceCode).AddToContainer(cont, 11, 1)
	'
	vm.AddContainer(cont)
End Sub


Sub txtcolorcopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("txtcolor")
End Sub

Sub txtcolordownload_click(e As BANanoEvent)
	vue.DownloadCode("txtcolor", "txtcolor.txt")
End Sub




Sub decincecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("decince")
End Sub

Sub decincedownload_click(e As BANanoEvent)
	vue.DownloadCode("decince", "decince.txt")
End Sub



Sub decinccopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("decinc")
End Sub

Sub decincdownload_click(e As BANanoEvent)
	vue.DownloadCode("decinc", "decinc.txt")
End Sub



Sub n1increment_click(e As BANanoEvent)
	vm.Increment("n1x", 1)
End Sub

Sub n1decrement_click(e As BANanoEvent)
	vm.Decrement("n1x", 1)
End Sub

Sub passtxtcopy_click(e As BANanoEvent)
vue.CopyCode2Clipboard("passtxt")
End Sub

Sub passtxtdownload_click(e As BANanoEvent)
vue.DownloadCode("passtxt", "passtxt.txt")
End Sub


Sub shapedtxtcopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("shapedtxt")
End Sub

Sub shapedtxtdownload_click(e As BANanoEvent)
	vue.DownloadCode("shapedtxt", "shapedtxt.txt")
End Sub



Sub filledtxtcopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("filledtxt")
End Sub

Sub filledtxtdownload_click(e As BANanoEvent)
	vue.DownloadCode("filledtxt", "filledtxt.txt")
End Sub



Sub outlinecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("outline")
End Sub

Sub outlinedownload_click(e As BANanoEvent)
	vue.DownloadCode("outline", "outline.txt")
End Sub


Sub calcitcopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("calcit")
End Sub

Sub calcitdownload_click(e As BANanoEvent)
	vue.DownloadCode("calcit", "calcit.txt")
End Sub


	

Sub textaftercopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("textafter")
End Sub

Sub textafterdownload_click(e As BANanoEvent)
	vue.DownloadCode("textafter", "textafter.txt")
End Sub



Sub t1evecopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("t1eve")
End Sub

Sub t1evedownload_click(e As BANanoEvent)
	vue.DownloadCode("t1eve", "t1eve.txt")
End Sub




Sub t1cccopy_click(e As BANanoEvent)
	vue.CopyCode2Clipboard("t1cc")
End Sub

Sub t1ccdownload_click(e As BANanoEvent)
	vue.DownloadCode("t1cc", "t1cc.txt")
End Sub


Sub t1after_click(e As BANanoEvent)
	vm.ShowSnackBarSuccess("Clicked Button After Text Field!")
End Sub

Sub t1_clear(e As BANanoEvent)
	vm.ShowSnackBar("t1 clear")
End Sub


Sub t1_keydown(e As BANanoEvent)
	vm.NavBar.UpdateTitle($"t1 keydown..."$)
End Sub

Sub t1append_click(e As BANanoEvent)
	vm.ShowSnackBar("append click")
End Sub

Sub t1appendouter_click(e As BANanoEvent)
	vm.ShowSnackBar("append-outer click")
End Sub

Sub t1prepend_click(e As BANanoEvent)
	vm.ShowSnackBar("prepend click")

End Sub

Sub t1prependinner_click(e As BANanoEvent)
	vm.ShowSnackBar("prepend-inner click")
End Sub

