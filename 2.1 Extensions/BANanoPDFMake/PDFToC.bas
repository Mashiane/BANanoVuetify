B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private options As Map
	Private toc As Map
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize As PDFToC
	options.Initialize
	toc.Initialize  
	Return Me
End Sub

'set the title
Sub SetTitle(text As PDFText) As PDFToC
	options.Put("title", text.Content)
	Return Me
End Sub

'set numberStyle
Sub SetNumberStyle(style As PDFStyle) As PDFToC
	options.Put("numberStyle", style.Content)
	Return Me
End Sub

'get the content
Sub getContent As Map
	toc.Put("toc", options)
	Return toc
End Sub
