B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.3
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Template As VMElement
	Public ID As String
	Private DesignMode As Boolean
	Private Static As Boolean
	Private EventHandler As Object
	Private vue As BANanoVue
	Private methods As Map
	Private computed As Map
	Private watches As Map
	Private created As BANanoObject
	Private mounted As BANanoObject
	Private beforeCreate As BANanoObject
	Private destroyed As BANanoObject
	Private beforeMount As BANanoObject
	Private updated As BANanoObject
	Private beforeDestroy As BANanoObject
	Private activated As BANanoObject
	Private deactivated As BANanoObject
	Private beforeUpdate As BANanoObject
	Private opt As Map
	Private data As Map
	Private refs As Map
	Private props As List
	Private BANano As BANano
	Public URL As String
	Public name As String
	Private propFrom As String
End Sub

'initialize component
Public Sub Initialize(v As BANanoVue, sid As String, Module As Object) As VMComponent
	ID = sid.tolowercase
	vue = v
	Template.Initialize(v, ID).SetTag("template")
	DesignMode = False
	EventHandler = Module
	Static = False
	'
	DesignMode = False
	opt.Initialize
	data.Initialize
	refs.Initialize
	props.Initialize
	methods.Initialize
	computed.Initialize
	watches.Initialize
	beforeMount = Null
	beforeUpdate = Null
	created = Null
	mounted = Null
	destroyed = Null
	updated = Null
	beforeCreate = Null
	activated = Null
	deactivated = Null
	beforeDestroy = Null
	URL = $"/${ID}"$
	name = ID
	Return Me
End Sub

Sub RemoveData(key As String) As VMComponent
	key = key.ToLowerCase
	data.Remove(key)
	Return Me
End Sub

Sub SetData(prop As String, valuex As Object) As VMComponent
	SetStateSingle(prop, valuex)
	Return Me
End Sub

Sub GetData(prop As String) As Object
	Dim obj As Object = GetState(prop, Null)
	Return obj
End Sub

'add vm components
Sub AddComponent(comp As String) As VMComponent
	SetText(comp)
	Return Me
End Sub

Sub SetText(t As String) As VMComponent
	Template.SetText(t)
	Return Me
End Sub

'add a property
Sub AddProp(propName As String) As VMComponent
	props.Add(propName)
	Return Me
End Sub

Sub AddProps(propsList As List) As VMComponent
	For Each k As String In propsList
		AddProp(k)
	Next
	Return Me
End Sub

Sub RenderIt As BANanoObject
	Dim option As Map = CreateMap("template" : $"{{ ${propFrom} }}"$)
	Dim bo As BANanoObject = BANano.RunJavascriptMethod("createElement",Array(option))
	Return bo
End Sub

Sub SetFunctional(b As Boolean) As VMComponent
	opt.Put("functional", b)
	Return Me
End Sub

Sub TemplateFromProperty(propName As String) As VMComponent
	propName = propName.ToLowerCase
	propFrom = propName
	Dim cb As BANanoObject = BANano.CallBack(Me, "RenderIt", Null)
	opt.Put("render", cb)
	Return Me
End Sub


Sub SetStatic(b As Boolean) As VMComponent
	Static = b
	Template.SetStatic(b)
	Return Me
End Sub


Sub ToString As String
	Return Template.ToString
End Sub

Sub SetDesignMode(b As Boolean) As VMComponent
	Template.SetDesignMode(b)
	DesignMode = b
	Return Me
End Sub

Sub Component() As Map
	Template.RemoveAttributes(Array("v-show", ":disabled", ":required", ":class", "v-model", "tabindex", ":style"))
	Dim tmp As String = Template.tostring
	If data.Size > 0 Then
		Dim cb As BANanoObject = BANano.CallBack(Me, "returnData", Null)
		opt.Put("data", cb)
	End If
	If methods.Size > 0 Then opt.Put("methods", methods)
	If computed.Size > 0 Then opt.Put("computed", computed)
	If watches.Size > 0 Then opt.Put("watch", watches)
	If props.Size <> 0 Then opt.Put("props", props)
	If updated <> Null Then opt.Put("updated", updated)
	If destroyed <> Null Then opt.Put("destroyed", destroyed)
	If mounted <> Null Then	opt.Put("mounted", mounted)
	If beforeCreate <> Null Then opt.Put("beforeCreate", beforeCreate)
	If created <> Null Then opt.Put("created", created)
	If beforeMount <> Null Then opt.Put("beforeMount", beforeMount)
	If beforeUpdate <> Null Then opt.Put("beforeUpdate", beforeUpdate)
	If activated <> Null Then opt.Put("activated", activated)
	If deactivated <> Null Then opt.Put("deactivated", deactivated)
	If beforeDestroy <> Null Then opt.Put("beforeDestroy", beforeDestroy)
	opt.Put("template", tmp)
	Return opt
End Sub


private Sub ReturnData As Map
	Return data
End Sub

'set computed
Sub SetComputed(Module As Object, k As String, methodName As String) As VMComponent
	methodName = methodName.ToLowerCase
	If SubExists(Module, methodName) Then
		k = k.tolowercase
		If data.ContainsKey(k) Then
			SetStateSingle(k, Null)
		End If
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
		computed.Put(k, cb)
	End If
	Return Me
End Sub

'set watches 
Sub SetWatch(Module As Object, k As String, bImmediate As Boolean, bDeep As Boolean, methodName As String) As VMComponent
	methodName = methodName.tolowercase
	If SubExists(Module, methodName) Then
		k = k.tolowercase
		If data.ContainsKey(k) Then
			SetStateSingle(k, Null)
		End If
		Dim newVal As Object
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(newVal))
		Dim deepit As Map = CreateMap()
		deepit.Put("handler", methodName)
		deepit.Put("deep", bDeep)
		deepit.Put("immediate", bImmediate)
		watches.Put(k, deepit)
		methods.Put(methodName, cb)
	End If
	Return Me
End Sub



'set created
Sub SetCreated(Module As Object,methodName As String) As VMComponent
	methodName = methodName.ToLowerCase
	created = BANano.CallBack(Module, methodName, Null)
	Return Me
End Sub

'set direct method
Sub SetMethod(Module As Object,methodName As String) As VMComponent
	methodName = methodName.ToLowerCase
	If SubExists(Module, methodName) Then
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(Module, methodName, Array(e))
		methods.Put(methodName, cb)
	End If
	Return Me
End Sub

'set before destroy
Sub SetBeforeDestroy(module As Object,methodName As String) As VMComponent
	methodName = methodName.ToLowerCase
	beforeDestroy = BANano.CallBack(module, methodName, Null)
	Return Me
End Sub

'set activated
Sub SetActivated(module As Object,methodName As String) As VMComponent
	methodName = methodName.ToLowerCase
	activated = BANano.CallBack(module, methodName, Null)
	Return Me
End Sub


'set deactivated
Sub SetDeActivated(Module As Object,methodName As String) As VMComponent
	methodName = methodName.ToLowerCase
	deactivated = BANano.CallBack(Module, methodName, Null)
	Return Me
End Sub


'set updated
Sub SetUpdated(Module As Object,methodName As String) As VMComponent
	methodName = methodName.ToLowerCase
	updated = BANano.CallBack(Module, methodName, Null)
	Return Me
End Sub

'set beforemount
Sub SetBeforeMount(Module As Object,methodName As String) As VMComponent
	methodName = methodName.ToLowerCase
	beforeMount = BANano.CallBack(Module, methodName, Null)
	Return Me
End Sub

'set beforeupdate
Sub SetBeforeUpdate(Module As Object,methodName As String) As VMComponent
	methodName = methodName.ToLowerCase
	beforeMount = BANano.CallBack(Module, methodName, Null)
	Return Me
End Sub


'set mounted
Sub SetMounted(Module As Object,methodName As String) As VMComponent
	methodName = methodName.ToLowerCase
	mounted = BANano.CallBack(Module, methodName, Null)
	Return Me
End Sub


'set destroyed
Sub SetDestroyed(Module As Object,methodName As String) As VMComponent
	methodName = methodName.ToLowerCase
	destroyed = BANano.CallBack(Module, methodName, Null)
	Return Me
End Sub



'set before created
Sub SetBeforeCreate(Module As Object,methodName As String) As VMComponent
	methodName = methodName.ToLowerCase
	beforeCreate = BANano.CallBack(Module, methodName, Null)
	Return Me
End Sub


'set a call back
Sub SetCallBack(methodName As String, cb As BANanoObject)
	methodName = methodName.ToLowerCase
	methods.Put(methodName, cb)
End Sub


'set the state
Sub SetState(m As Map) As VMComponent
	For Each k As String In m.Keys
		Dim v As Object = m.Get(k)
		k = k.tolowercase
		data.Put(k, v)
	Next
	Return Me
End Sub

'return if state exists
Sub HasState(k As String) As Boolean
	k = k.tolowercase
	Return data.ContainsKey(k)
End Sub

'get the state
Sub GetState(k As String, v As Object) As Object
	k = k.tolowercase
	If data.ContainsKey(k) Then
		Dim out As Object = data.GetDefault(k,v)
		Return out
	Else
		Log("GetState: First set the v-model for " & k)
		Return ""
	End If
End Sub

'generate another vue instance
Sub RenderTo(elID As String)
	elID = elID.tolowercase
	BANano.GetElement($"#${elID}"$).empty
	'
	Dim boVUE As BANanoObject
	opt.Put("el", $"#${elID}"$)
	Component
	boVUE.Initialize2("Vue", opt)
	'get the state
	Dim dKey As String = "$data"
	data = boVUE.GetField(dKey).Result
	'get the refs
	Dim rKey As String = "$refs"
	refs = boVUE.GetField(rKey).result
End Sub


Sub ToggleState(stateName As String) As VMComponent
	Dim bcurrent As Boolean = GetState(stateName,"")
	bcurrent = Not(bcurrent)
	Dim optx As Map = CreateMap()
	optx.Put(stateName, bcurrent)
	SetState(optx)
	Return Me
End Sub

'check if we have state
Sub StateExists(stateName As String) As Boolean
	stateName = stateName.tolowercase
	Return data.ContainsKey(stateName)
End Sub

'set state object
Sub SetStateMap(mapKey As String, mapValues As Map) As VMComponent
	mapKey = mapKey.tolowercase
	Dim opt As Map = CreateMap()
	opt.Put(mapKey, mapValues)
	SetState(opt)
	Return Me
End Sub

'set state list
Sub SetStateList(mapKey As String, mapValues As List) As VMComponent
	mapKey = mapKey.tolowercase
	Dim opt As Map = CreateMap()
	opt.Put(mapKey, mapValues)
	SetState(opt)
	Return Me
End Sub

Sub SetStateListValues(mapValues As List) As VMComponent
	For Each lstValue As String In mapValues
		lstValue = lstValue.tolowercase
		Dim opt As Map = CreateMap()
		opt.Put(lstValue, "")
		SetState(opt)
	Next
	Return Me
End Sub

Sub GetStates(lst As List) As Map
	Dim smm As Map = CreateMap()
	For Each lstrec As String In lst
		lstrec = lstrec.tolowercase
		Dim state As Object = GetState(lstrec, Null)
		smm.Put(lstrec, state)
	Next
	Return smm
End Sub

Sub SetStateTrue(k As String) As VMComponent
	SetStateSingle(k,True)
	Return Me
End Sub

Sub SetStateFalse(k As String) As VMComponent
	SetStateSingle(k,False)
	Return Me
End Sub

Sub SetStateIncrement(k As String) As VMComponent
	Dim oldV As String = GetState(k, "0")
	oldV = BANano.parseInt(oldV) + 1
	SetStateSingle(k, oldV)
	Return Me
End Sub

Sub SetStateDecrement(k As String) As VMComponent
	Dim oldV As String = GetState(k, "0")
	oldV = BANano.parseInt(oldV) - 1
	SetStateSingle(k, oldV)
	Return Me
End Sub

'a single state change
Sub SetStateSingle(k As String, v As Object) As VMComponent
	k = k.tolowercase
	Dim optx As Map = CreateMap()
	optx.Put(k, v)
	SetState(optx)
	Return Me
End Sub