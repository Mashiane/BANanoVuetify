B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private columnsInt As List
	Public columnGap As Int
	Private cols As Map
	Public style As PDFStyle
End Sub

'Initializes the columns
Public Sub Initialize As PDFColumns
	columnsInt.Initialize
	columnGap = 10
	cols.Initialize 
	style.Initialize
	Return Me
End Sub

'set absolute position
Sub SetAbsolutePosition(x As Int, y As Int) As PDFColumns
	Dim opt As Map = CreateMap()
	opt.Put("x", x)
	opt.Put("y", y)
	cols.Put("absolutePosition", opt)
	Return Me
End Sub

'add a list
Sub AddList(lst As PDFList) As PDFColumns
	columnsInt.Add(lst.Content)
	Return Me
End Sub

'add a stack
Sub AddStack(stack As PDFStack) As PDFColumns
	columnsInt.Add(stack.Content)
	Return Me
End Sub

'add pdf text
Sub AddText(text As PDFText) As PDFColumns
	columnsInt.Add(text.Content)
	Return Me
End Sub

'add columns
Sub AddColumns(colsx As PDFColumns) As PDFColumns
	columnsInt.Add(colsx.Content) 
	Return Me
End Sub

'add string
Sub AddString(txt As String) As PDFColumns
	columnsInt.Add(txt)
	Return Me
End Sub

'set page break before
Sub SetPageBreakBefore As PDFColumns
	cols.Put("pageBreak", "before")
	Return Me
End Sub

'set page break after
Sub SetPageBreakAfter As PDFColumns
	cols.Put("pageBreak", "after")
	Return Me
End Sub

'get the contents of the columns
Sub getContent As Map
	If columnsInt.Size > 0 Then
		cols.Put("columnGap", columnGap)
		cols.Put("columns", columnsInt)
	End If
	style.Include(cols)
	Return cols
End Sub
