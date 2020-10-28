B4J=true
Group=Default Group\Components
ModulesStructureVersion=1
Type=StaticCode
Version=8.5
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Public name As String = "mealrecipes"
	Public mealrecipes As VMComponent
	Private vue As BANanoVue
	Private vm As BANanoVM
End Sub

Sub Initialize
	'get the app instance
	vm = pgIndex.vm
	'get the view instance
	vue = vm.vue
	'initialize the component
	mealrecipes.Initialize(vue, name, $"/${name}"$, Me)
	'
	Dim stemplate As String = $"<v-container grid-list-lg>
        <v-layout row wrap>
            <v-flex xs12 sm6 md6 lg4 v-for="(item, idx) in recipes" :key="idx">
                <v-card data-cy="recipeEntry">
                    <v-responsive>
                        <v-img :src="item.recipe.image"></v-img>
                    </v-responsive>

                    <v-card-text>
                        <div class="title my-5">{{ item.recipe.label }}</div>

                        <div class="subheading">Ingredients</div>
                        <ul>
                            <li v-for="(ingredient, i) in item.recipe.ingredientLines" :key="i">
                                {{ ingredient }}
                            </li>
                        </ul>
                    </v-card-text>

                    <v-card-actions>
                        <v-btn color="green" v-if="isauthenticated" dark @click="orderrecipe(item)">Order</v-btn>
                    </v-card-actions>
                </v-card>
            </v-flex>
        </v-layout>
    </v-container>"$
	
	'set the template
	mealrecipes.SetTemplate(stemplate)
	'
	'define states used in this component
	mealrecipes.SetComputed("recipes", Me, "getRecipes")
	mealrecipes.SetMethod(Me, "orderrecipe")
	mealrecipes.SetComputed("isauthenticated", Me, "getIsAuthenticated")
End Sub

Sub getIsAuthenticated As Boolean   'IgnoreDeadCode
	Dim bisAuthenticated As Boolean = vm.GetDataGlobal("isAuthenticated")
	Return bisAuthenticated
End Sub


'order the recipe
Sub orderrecipe(item As Map) 'IgnoreDeadCode
	Log(item)
	'check if the user is authenticated
	Dim bisAuthenticated As Boolean = vm.GetDataGlobal("isAuthenticated")
	If bisAuthenticated Then
		'add the item
		'get the user details
		Dim user As Map = vm.getdataglobal("user")
		Dim userid As String = user.get("uid")
		Log(userid)
		Log(item)
	Else
		'the user is not authenticated, require sign in
		vm.NavigateTo("/signin")
	End If
End Sub

'get global recipes
Sub getRecipes As List 'IgnoreDeadCode
	Dim recipes As List = vm.getdataglobal("recipes")
	Return recipes
End Sub
