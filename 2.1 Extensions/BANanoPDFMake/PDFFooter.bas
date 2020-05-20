B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
Sub Class_Globals
	Public LeftPart As PDFText
	Public RightPart As PDFText
	Private cols As List
	Dim ftr As Map
	Public style As PDFStyle
End Sub

'Initializes the footer
Public Sub Initialize
	cols.Initialize
	LeftPart.Initialize
	RightPart.Initialize  
	ftr.Initialize 
	style.Initialize 
End Sub

'get the contents of the footer
Sub getContent As Map
	cols.Add(LeftPart.Content)
	cols.Add(RightPart.Content)
	ftr.Put("columns", cols)
	style.Include(ftr)
	Return ftr
End Sub