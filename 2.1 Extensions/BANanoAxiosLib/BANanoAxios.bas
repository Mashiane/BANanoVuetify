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
Public Sub Initialize() As BANanoAxios
	BANano.DependsOnAsset("axios.min.js")
	Axios.Initialize("axios")
	Return Me
End Sub

'get an endpoint and return a promise
Sub Get(EndPoint As String) As BANanoPromise
	AxiosPromise = Axios.RunMethod("get", Array(EndPoint))
	Return AxiosPromise
End Sub