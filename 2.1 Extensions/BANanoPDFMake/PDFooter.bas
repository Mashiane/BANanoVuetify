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
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	cols.Initialize
	LeftPart.Initialize
	RightPart.Initialize  
	ftr.Initialize 
End Sub

Sub getFooter As Map
	cols.Add(LeftPart.Content)
	cols.Add(RightPart.Content)
	ftr.Put("columns", cols)
	Return ftr
End Sub