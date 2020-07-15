B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.45
@EndOfDesignText@
Sub Class_Globals
	Private Axios As BANanoObject
	Private AxiosPromise As BANanoPromise
	Private BANano As BANano  'ignore
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize(EndPoint As String) As BANanoPromise
	BANano.DependsOnAsset("axios.min.js")
	'
	Axios.Initialize("axios")
	
	AxiosPromise = Axios.RunMethod("get", Array(EndPoint))
	Return AxiosPromise
End Sub
