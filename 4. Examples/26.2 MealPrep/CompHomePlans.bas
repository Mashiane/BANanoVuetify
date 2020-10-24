B4J=true
Group=Default Group\Components
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "homeplans"
	Public homeplans As VMComponent
	Private vue As BANanoVue
	Private vm As BANanoVM
End Sub

Sub Initialize
	'get the app instance
	vm = pgIndex.vm
	'get the view instance
	vue = vm.vue
	'initialize the component
	homeplans.Initialize(vue, name, $"/${name}"$, Me)
	'
	Dim cont As VMContainer = vm.CreateContainer("", Me).Setgridlistlg
	'add row 1
	cont.AddRows(1).AddColumns12
	cont.AddClassRC(1, 1, Array("text-xs-center display-1 font-weight-black my-5"))
	cont.AddComponent(1, 1, "Available Meal Plans")
	'add row 2
	cont.addrows(1).AddColumns(3, 12, 4, 4, 4)
	
	Dim mp1 As String = MealPlanTemplate("Keto", "./assets/keto.jpg", "KETO", _
	"The Keto diet is a high-fat, adequate-protein, low-carbohydrate diet. The diet forces the body to burn fats rather than carbohydrates by putting the body into ketosis.")
	cont.AddComponent(2, 1, mp1)
	'
	Dim mp2 As String = MealPlanTemplate("Paelo", "./assets/paleo.jpg", "PAELO", _
	"The Paleo diet requires the predominant consumption of foods presumed to have been the only foods available to or consumed by humans during the Paleolithic era.")
	cont.AddComponent(2, 2, mp2)
	'
	Dim mp3 As String = MealPlanTemplate("Vegan", "./assets/vegan.jpg", "VEGAN", _
	"The vegan diet abstains from the use of animal products. The vegan diet does not consume meat,	diary products, eggs or any all other animal-derived ingredients.")
	cont.AddComponent(2, 3, mp3)
	'
	cont.addrows(1).AddColumns12
	
	'add a spacer
	Dim vspacer As VMElement = vm.VDivider("")
	vspacer.SetStyleSingle("height", "100px")
	vspacer.SetStyleSingle("max-height", "100px")
	cont.AddComponent(3, 1, vspacer.tostring)
	
	'
	homeplans.setdata("r1show", True)
	homeplans.setdata("r1c1show", True)
	'
	homeplans.setdata("r2show", True)
	homeplans.setdata("r2c1show", True)
	homeplans.setdata("r2c2show", True)
	homeplans.setdata("r2c3show", True)
	'
	homeplans.setdata("r3show", True)
	homeplans.setdata("r3c1show", True)
	
	'set the template
	homeplans.SetTemplate(cont.tostring)
End Sub

Sub MealPlanTemplate(key As String, img As String, title As String, desc As String) As String
	Dim card As String = $"<v-card>
                    <v-responsive>
                        <v-img src="${img}" height="500px">
                            <v-container fill-height fluid>
                                <v-layout fill-height>
                                    <v-flex xs12 align-end flexbox>
                                        <span class="headline white--text">${title}</span>
                                    </v-flex>
                                </v-layout>
                            </v-container>
                        </v-img>
                    </v-responsive>

                    <v-card-text>
                        <div>
                            <h3 class="headline mb-0">${key}</h3>
                            <div>${desc}</div>
                        </div>
                    </v-card-text>

                    <v-card-actions>
                        <v-btn outlined block color="green">Select This Plan</v-btn>
                    </v-card-actions>
                </v-card>"$
	Return card
End Sub
