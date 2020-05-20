B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Public userPassword As String
	Public ownerPassword As String
	Public printingHR As Boolean
	Public printingLR As Boolean
	Public modifying As Boolean
	Public copying As Boolean
	Public annotating As Boolean
	Public fillingForms As Boolean
	Public contentAccessibility As Boolean
	Public documentAssembly As Boolean
	Private permissions As Map
End Sub

'Initializes the object.
Public Sub Initialize
	permissions.Initialize
	printingHR = True
	printingLR = False
	copying = True
	annotating = True
	fillingForms = True
	contentAccessibility = True
	documentAssembly = True
	userPassword = Null
	ownerPassword = Null
End Sub

Sub Set(fldName As String, fldValue As Object)
	Select Case fldName
	Case "ownerPassword"
		ownerPassword = fldValue
	Case "userPassword"
		userPassword = fldValue
	Case "modifying"
		modifying = fldValue
	Case "copying"
		copying = fldValue
	Case "annotating"
		annotating = fldValue
	Case "fillingForms"
		fillingForms = fldValue
	Case "contentAccessibility"
		contentAccessibility = fldValue
	Case "documentAssembly"
		documentAssembly = fldValue
	Case "userPassword"
		userPassword = fldValue
	Case "ownerPassword"
		ownerPassword = fldValue
	Case "printing"
		If fldValue = "highResolution" Then printingHR = True
		If fldValue = "lowResolution" Then printingLR = True
	End Select
End Sub

Sub getContent As Map
	If printingHR Then permissions.Put("printing", "highResolution")
	If printingLR Then permissions.Put("printing", "lowResolution")
	permissions.Put("modifying", modifying)
	permissions.Put("copying", copying)
	permissions.Put("annotating", annotating)
	permissions.Put("fillingForms", fillingForms)
	permissions.Put("contentAccessibility", contentAccessibility)
	permissions.Put("documentAssembly", documentAssembly)
	Return permissions
End Sub