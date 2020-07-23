B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.5
@EndOfDesignText@
#ignorewarnings:12
Sub Class_Globals
	Private jsonQ As BANanoJSONQuery
	Private BANano As BANano
	Private MorderBy As Map
	Private MWhere As Map
	Private MOrWhere As Map
	'
	Public const ORDER_ASC As String = "asc"
	Public const ORDER_DESC As String = "desc"
	'
	Public const OPER_EQUAL As String = "eq"
	Public const OPER_GREATER_THAN As String = "gt"
	Public const OPER_NOT_EQUAL As String = "ne"
	Public const OPER_LESS_THAN As String = "lt"
	Public const OPER_BETWEEN As String = "bt"
	Public const OPER_IN As String = "in"
	Public const OPER_NOT_IN As String = "ni"
	Public const OPER_LIKE As String = "li"
End Sub

'open the json string you need to process
Public Sub Initialize(jsonString As String) As BANanoJSON
	jsonQ.Initialize2(jsonString)
	MorderBy.Initialize
	MWhere.Initialize
	MOrWhere.Initialize
	Return Me
End Sub

'specify fields to select
Sub SelectFields(fields As List) As BANanoJSON
	'build the select fields
	If BANano.isnull(fields) = False Then
		Dim fld1 As String = fields.Get(0)
		If fld1 <> "*" Then 
			jsonQ = jsonQ.SelectFields(fields).ToJQ
		End If
	End If
	Return Me
End Sub

'order by a field in asc / desc order
Sub Order(fld As String) As BANanoJSON
	MorderBy.put(fld, ORDER_ASC)
	Return Me
End Sub

'order by a field in desc order
Sub OrderDesc(fld As String) As BANanoJSON
	MorderBy.put(fld, ORDER_DESC)
	Return Me
End Sub

'where
Sub Where(fld As String, operator As String, value As String) As BANanoJSON
	Select Case operator
	Case "eq", "gt", "ne", "lt", "bt","in","ni", "li"
	Case Else
		operator = "eq"
	End Select
	'
	Dim sb As StringBuilder
	sb.Initialize
	sb.append(fld).append(".$").append(operator)
	Dim kv As String = sb.tostring
	'fld to search
	MWhere.put(kv, value)
	Return Me
End Sub

'or where
Sub OrWhere(fld As String, operator As String, value As String) As BANanoJSON
	Select Case operator
	Case "eq", "gt", "ne", "lt", "bt","in","ni", "li"
	Case Else
		operator = "eq"
	End Select
	'
	Dim sb As StringBuilder
	sb.Initialize
	sb.append(fld).append(".$").append(operator)
	Dim kv As String = sb.tostring
	'fld to search
	MOrWhere.put(kv, value)
	Return Me
End Sub


'run the result and return answer
Sub Result As List
	'where
	If MWhere.Size > 0 Then
		Dim whereJSON As String = BANano.tojson(MWhere)
		whereJSON = whereJSON.replace(QUOTE,"'")
		jsonQ.Where(whereJSON)
	End If
	'or where
	If MOrWhere.size > 0 Then
		Dim OrwhereJSON As String = BANano.tojson(MOrWhere)
		OrwhereJSON = OrwhereJSON.replace(QUOTE,"'")
		jsonQ.OrWhere(OrwhereJSON)
	End If
	' order
	If MorderBy.Size > 0 Then
		Dim orderJSON As String = BANano.tojson(MorderBy)
		orderJSON = orderJSON.replace(QUOTE,"'")
		jsonQ.Order(orderJSON)
	End If
	'fields
	jsonQ.ToJQ
	Log(jsonQ)
	Dim rs As List = jsonQ.All
	Return rs
End Sub
