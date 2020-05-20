B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private row As List
End Sub

'Initializes the object.
Public Sub Initialize As PDFRow
	row.Initialize 
	Return Me
End Sub

'add an image
Sub AddImage(img As PDFImage) As PDFRow
	row.Add(img.Content)
	Return Me
End Sub

'add empty column
Sub AddEmpty As PDFRow
	row.Add(CreateMap())
	Return Me	
End Sub

'add a list
Sub AddList(lst As PDFList) As PDFRow
	row.Add(lst.Content)
	Return Me
End Sub

'add text to the row
Sub AddText(txt As PDFText) As PDFRow
	row.Add(txt.Content)
	Return Me
End Sub

'add table
Sub AddTable(tbl As PDFTable) As PDFRow
	row.Add(tbl.Content)
	Return Me
End Sub

'add a string
Sub AddString(txt As String) As PDFRow
	row.Add(txt)
	Return Me
End Sub

'return the row contents
Sub getContent As List
	Return row
End Sub