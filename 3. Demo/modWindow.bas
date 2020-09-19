B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "windowCode"
	Public title As String = "Window"
	Private vm As BANanoVM
	Private vue As BANanoVue
	Private BANano As BANano
End Sub

Sub Code
	vm = pgIndex.vm
	vue = vm.vue
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(3).AddColumns12
	'
	Dim vcard As VMCard = vm.CreateCard("onb", Me).SetFlat(True).SetTile(True)
	Dim window As VMWindow = vm.CreateWindow("onw", Me).SetVModel("onboarding").SetData("onboarding", 0)
	Dim winitem As VMWindowItem = vm.CreateWindowItem("onwi", Me).SetData("lengthx", 3)
	winitem.SetVFor("n", "lengthx").SetAttrSingle(":key", "`card-${n}`")
	Dim itemcard As VMCard = vm.CreateCard("oncard", Me).SetColor("transparent").SetHeight("200")
	itemcard.Container.AddRows(1).AddColumns12
	itemcard.Container.SetClassRC(1,1, "fill-height")
	itemcard.Container.SetAlignRC(1, 1, "center")
	itemcard.Container.SetJustifyRC(1, 1, "center")
	itemcard.Container.SetAttrRC(1, 1, "tag", "v-card-text")
	itemcard.Container.AddComponent(1,1, vm.Loremipsum)
	itemcard.Actions.SetSpaceBetween
	itemcard.Actions.AddIcon("prevslide", "mdi-chevron-left","","","","")
	itemcard.Actions.AddIcon("nextslide", "mdi-chevron-right","","","","")
	'
	winitem.AddComponent(itemcard.tostring)	
	window.AddComponent(winitem.tostring)
	vcard.AddComponent(window.tostring)
	
	vcard.AddToContainer(cont,1,1)
	
	vm.AddContainer(cont)
End Sub

Sub prevslide_click(e As BANanoEvent)
	vm.DecrementTo("onboarding", 1, 0)
End Sub

Sub nextslide_click(e As BANanoEvent)
	vm.IncrementTo("onboarding", 1, 2)
End Sub


'   
   '<v-item-group
'        v-model="onboarding"
'        class="text-center"
'        mandatory
'      >
'        <v-item
'          v-For="n in length"
'          :key="`btn-${n}`"
'          v-slot:default="{ active, toggle }"
'        >
'          <v-btn
'            :input-value="active"
'            icon
'            @click="toggle"
'          >
'            <v-icon>mdi-record</v-icon>
'          </v-btn>
'        </v-item>
'      </v-item-group>
'
'<script>
'  export default {
'    data: () => ({
'      length: 3,
'      onboarding: 0,
'    }),
'
'    methods: {
'      Next () {
'        this.onboarding = this.onboarding + 1 === this.length
'          ? 0
'          : this.onboarding + 1
'      },
'      prev () {
'        this.onboarding = this.onboarding - 1 < 0
'          ? this.length - 1
'          : this.onboarding - 1
'      },
'    },
'  }
'</script>