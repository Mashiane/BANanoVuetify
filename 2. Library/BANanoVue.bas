B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12, 9
Sub Class_Globals
	Type FileObject(FileName As String, FileDate As String, FileSize As Long, FileType As String)
	Public BOVue As BANanoObject
	Private BANAno As BANano  'ignore
	Public methods As Map
	Public data As Map
	'Public store As Map
	Public el As BANanoObject
	Public refs As BANanoObject
	Public body As BANanoElement
	Public Template As VueHTML
	Public computed As Map
	Public watches As Map
	'Private TypeOfString As BANanoObject   'ignore
	'Private TypeOfNumber As BANanoObject   'ignore
	'Private TypeOfBoolean As BANanoObject  'ignore
	'Private TypeOfArray As BANanoObject    'ignore
	'Private TypeOfObject As BANanoObject   'ignore
	'Private TypeOfDate As BANanoObject     'ignore
	'Private TypeOfFunction As BANanoObject  'ignore
	'Private TypeOfSymbol As BANanoObject    'ignore
	'Private BORouter As BANanoObject      'ignore
	Private routes As List
	Public components As Map
	Public Options As Map
	Private dynamicStyle As Map
	Public GetTemplate As String
	Public const colors_red As String = "#F44336"
	Public const colors_pink As String = "#E91E63"
	Public const colors_purple As String = "#9C27B0"
	Public const colors_deepPurple As String = "#673AB7"
	Public const colors_indigo As String = "#3F51B5"
	Public const colors_blue As String = "#2196F3"
	Public const colors_lightBlue As String = "#03A9F4"
	Public const colors_cyan As String = "#00BCD4"
	Public const colors_teal As String = "#009688"
	Public const colors_green As String = "#4CAF50"
	Public const colors_lightGreen As String = "#8BC34A"
	Public const colors_lime As String = "#CDDC39"
	Public const colors_yellow As String = "#ffe821"
	Public const colors_amber As String = "#FFC107"
	Public const colors_orange As String = "#FF9800"
	Public const colors_deepOrange As String = "#FF5722"
	Public const colors_brown As String = "#795548"
	Public const colors_grey As String = "#9E9E9E"
	Public const colors_blueGrey As String = "#607D8B"
	Public const colors_black As String = "#000000"
	Public const colors_white As String = "#ffffff"
	Public const colors_transparent As String = "transparent"
	'
	Public const BORDER_DEFAULT As String = ""
	Public const BORDER_DASHED As String = "dashed"
	Public const BORDER_DOTTED As String = "dotted"
	Public const BORDER_DOUBLE As String = "double"
	Public const BORDER_GROOVE As String = "groove"
	Public const BORDER_HIDDEN As String = "hidden"
	Public const BORDER_INSET As String = "inset"
	Public const BORDER_NONE As String = "none"
	Public const BORDER_OUTSET As String = "outset"
	Public const BORDER_RIDGE As String = "ridge"
	Public const BORDER_SOLID As String = "solid"
	
	'
	Public const COLOR_AMBER As String = "amber"
	Public const COLOR_BLACK As String = "black"
	Public const COLOR_BLUE As String = "blue"
	Public const COLOR_BLUEGREY As String = "blue-grey"
	Public const COLOR_BROWN As String = "brown"
	Public const COLOR_CYAN As String = "cyan"
	Public const COLOR_DEEPORANGE As String = "deep-orange"
	Public const COLOR_DEEPPURPLE As String = "deep-purple"
	Public const COLOR_GREEN As String = "green"
	Public const COLOR_GREY As String = "grey"
	Public const COLOR_INDIGO As String = "indigo"
	Public const COLOR_LIGHTBLUE As String = "light-blue"
	Public const COLOR_LIGHTGREEN As String = "light-green"
	Public const COLOR_LIME As String = "lime"
	Public const COLOR_ORANGE As String = "orange"
	Public const COLOR_PINK As String = "pink"
	Public const COLOR_PURPLE As String = "purple"
	Public const COLOR_RED As String = "red"
	Public const COLOR_TEAL As String = "teal"
	Public const COLOR_TRANSPARENT As String = "transparent"
	Public const COLOR_WHITE As String = "white"
	Public const COLOR_YELLOW As String = "yellow"
	Public const COLOR_NONE As String = ""
	'
	Public const INTENSITY_NORMAL As String = ""
	Public const INTENSITY_LIGHTEN5 As String = "lighten-5"
	Public const INTENSITY_LIGHTEN4 As String = "lighten-4"
	Public const INTENSITY_LIGHTEN3 As String = "lighten-3"
	Public const INTENSITY_LIGHTEN2 As String = "lighten-2"
	Public const INTENSITY_LIGHTEN1 As String = "lighten-1"
	Public const INTENSITY_DARKEN1 As String = "darken-1"
	Public const INTENSITY_DARKEN2 As String = "darken-2"
	Public const INTENSITY_DARKEN3 As String = "darken-3"
	Public const INTENSITY_DARKEN4 As String = "darken-4"
	Public const INTENSITY_ACCENT1 As String = "accent-1"
	Public const INTENSITY_ACCENT2 As String = "accent-2"
	Public const INTENSITY_ACCENT3 As String = "accent-3"
	Public const INTENSITY_ACCENT4 As String = "accent-4"
	'
	Public const SIZE_H1 As String = "h1"
	Public const SIZE_H2 As String = "h2"
	Public const SIZE_H3 As String = "h3"
	Public const SIZE_H4 As String = "h4"
	Public const SIZE_H5 As String = "h5"
	Public const SIZE_H6 As String = "h6"
	Public const SIZE_P As String = "p"
	Public const SIZE_SPAN As String = "span"
	Public const SIZE_BLOCKQUOTE As String = "blockquote"
	'
	Type ColorTypes(red As String, pink As String, purple As String, deepPurple As String, _
	indigo As String, blue As String, lightBlue As String, cyan As String, teal As String, green As String, _
	lightGreen As String, lime As String, yellow As String, amber As String, Orange As String, deepOrange As String, _
	brown As String, grey As String, blueGrey As String, black As String, white As String, transparent As String)
	Public Colors As ColorTypes
	
	Private ColorMap As Map
	Public Themes As Map
	Public TargetOptions As Map
	Public ColumnTypes As Map
	Public ColumnAlign As Map
	Public DataTypes As Map
	Public ControlTypes As Map
	Public Modules As Map
	Public SourceCode As StringBuilder
	Public HashType As Map
	Public Algorithm As Map
	Public Errors As Map
End Sub

'initialize view
Public Sub Initialize(Module As Object)
	'empty the body of the page
	body = BANAno.GetElement("#body")
	body.empty
	body.Append($"<div id="app"></div>"$)
	Template.Initialize("app","div")
	'
	Errors.Initialize
	SourceCode.Initialize
	Themes.Initialize
	Modules.Initialize
	BOVue.Initialize("Vue")
	'store = BOVue.RunMethod("observable", Null).Result
	
	Template.SetVCloak
	methods.Initialize
	data.Initialize
	computed.Initialize  
	watches.Initialize
	routes.Initialize 
	'TypeOfString = BOVue.GetField("String")
	'TypeOfNumber = BOVue.GetField("Number")
	'TypeOfBoolean = BOVue.GetField("Boolean")
	'TypeOfArray = BOVue.GetField("Array")
	'TypeOfObject = BOVue.GetField("Object")
	'TypeOfDate = BOVue.GetField("Date")
	'TypeOfFunction = BOVue.GetField("Function")
	'TypeOfSymbol = BOVue.GetField("Symbol")
	Options = CreateMap()
	dynamicStyle = CreateMap()
	'SetFontFamily("'Roboto', 'Helvetica', Arial, sans-serif")
	'
	Colors.initialize
	Colors.red = "red"
	Colors.pink = "pink"
	Colors.purple = "purple"
	Colors.deepPurple = "deep-purple"
	Colors.indigo = "indigo"
	Colors.blue = "blue"
	Colors.lightBlue = "light-blue"
	Colors.cyan = "cyan"
	Colors.teal = "teal"
	Colors.green = "green"
	Colors.lightGreen = "light-green"
	Colors.lime = "lime"
	Colors.yellow = "yellow"
	Colors.amber = "amber"
	Colors.Orange = "orange"
	Colors.deepOrange = "deep-orange"
	Colors.brown = "brown"
	Colors.grey = "grey"
	Colors.blueGrey = "blue-grey"
	Colors.black = "black"
	Colors.white = "white"
	Colors.transparent = "transparent"
	'
	ColorMap.Initialize
	ColorMap.put("red lighten-5", "#ffebee")
	ColorMap.put("red lighten-4", "#ffcdd2")
	ColorMap.put("red lighten-3", "#ef9a9a")
	ColorMap.put("red lighten-2", "#e57373")
	ColorMap.put("red lighten-1", "#ef5350")
	ColorMap.put("red", "#f44336")
	ColorMap.put("red darken-1", "#e53935")
	ColorMap.put("red darken-2", "#d32f2f")
	ColorMap.put("red darken-3", "#c62828")
	ColorMap.put("red darken-4", "#b71c1c")
	ColorMap.put("red accent-1", "#ff8a80")
	ColorMap.put("red accent-2", "#ff5252")
	ColorMap.put("red accent-3", "#ff1744")
	ColorMap.put("red accent-4", "#d50000")
	ColorMap.put("pink lighten-5", "#fce4ec")
	ColorMap.put("pink lighten-4", "#f8bbd0")
	ColorMap.put("pink lighten-3", "#f48fb1")
	ColorMap.put("pink lighten-2", "#f06292")
	ColorMap.put("pink lighten-1", "#ec407a")
	ColorMap.put("pink", "#e91e63")
	ColorMap.put("pink darken-1", "#d81b60")
	ColorMap.put("pink darken-2", "#c2185b")
	ColorMap.put("pink darken-3", "#ad1457")
	ColorMap.put("pink darken-4", "#880e4f")
	ColorMap.put("pink accent-1", "#ff80ab")
	ColorMap.put("pink accent-2", "#ff4081")
	ColorMap.put("pink accent-3", "#f50057")
	ColorMap.put("pink accent-4", "#c51162")
	ColorMap.put("purple lighten-5", "#f3e5f5")
	ColorMap.put("purple lighten-4", "#e1bee7")
	ColorMap.put("purple lighten-3", "#ce93d8")
	ColorMap.put("purple lighten-2", "#ba68c8")
	ColorMap.put("purple lighten-1", "#ab47bc")
	ColorMap.put("purple", "#9c27b0")
	ColorMap.put("purple darken-1", "#8e24aa")
	ColorMap.put("purple darken-2", "#7b1fa2")
	ColorMap.put("purple darken-3", "#6a1b9a")
	ColorMap.put("purple darken-4", "#4a148c")
	ColorMap.put("purple accent-1", "#ea80fc")
	ColorMap.put("purple accent-2", "#e040fb")
	ColorMap.put("purple accent-3", "#d500f9")
	ColorMap.put("purple accent-4", "#aa00ff")
	ColorMap.put("deep-purple lighten-5", "#ede7f6")
	ColorMap.put("deep-purple lighten-4", "#d1c4e9")
	ColorMap.put("deep-purple lighten-3", "#b39ddb")
	ColorMap.put("deep-purple lighten-2", "#9575cd")
	ColorMap.put("deep-purple lighten-1", "#7e57c2")
	ColorMap.put("deep-purple", "#673ab7")
	ColorMap.put("deep-purple darken-1", "#5e35b1")
	ColorMap.put("deep-purple darken-2", "#512da8")
	ColorMap.put("deep-purple darken-3", "#4527a0")
	ColorMap.put("deep-purple darken-4", "#311b92")
	ColorMap.put("deep-purple accent-1", "#b388ff")
	ColorMap.put("deep-purple accent-2", "#7c4dff")
	ColorMap.put("deep-purple accent-3", "#651fff")
	ColorMap.put("deep-purple accent-4", "#6200ea")
	ColorMap.put("indigo lighten-5", "#e8eaf6")
	ColorMap.put("indigo lighten-4", "#c5cae9")
	ColorMap.put("indigo lighten-3", "#9fa8da")
	ColorMap.put("indigo lighten-2", "#7986cb")
	ColorMap.put("indigo lighten-1", "#5c6bc0")
	ColorMap.put("indigo", "#3f51b5")
	ColorMap.put("indigo darken-1", "#3949ab")
	ColorMap.put("indigo darken-2", "#303f9f")
	ColorMap.put("indigo darken-3", "#283593")
	ColorMap.put("indigo darken-4", "#1a237e")
	ColorMap.put("indigo accent-1", "#8c9eff")
	ColorMap.put("indigo accent-2", "#536dfe")
	ColorMap.put("indigo accent-3", "#3d5afe")
	ColorMap.put("indigo accent-4", "#304ffe")
	ColorMap.put("blue lighten-5", "#e3f2fd")
	ColorMap.put("blue lighten-4", "#bbdefb")
	ColorMap.put("blue lighten-3", "#90caf9")
	ColorMap.put("blue lighten-2", "#64b5f6")
	ColorMap.put("blue lighten-1", "#42a5f5")
	ColorMap.put("blue", "#2196f3")
	ColorMap.put("blue darken-1", "#1e88e5")
	ColorMap.put("blue darken-2", "#1976d2")
	ColorMap.put("blue darken-3", "#1565c0")
	ColorMap.put("blue darken-4", "#0d47a1")
	ColorMap.put("blue accent-1", "#82b1ff")
	ColorMap.put("blue accent-2", "#448aff")
	ColorMap.put("blue accent-3", "#2979ff")
	ColorMap.put("blue accent-4", "#2962ff")
	ColorMap.put("light-blue lighten-5", "#e1f5fe")
	ColorMap.put("light-blue lighten-4", "#b3e5fc")
	ColorMap.put("light-blue lighten-3", "#81d4fa")
	ColorMap.put("light-blue lighten-2", "#4fc3f7")
	ColorMap.put("light-blue lighten-1", "#29b6f6")
	ColorMap.put("light-blue", "#03a9f4")
	ColorMap.put("light-blue darken-1", "#039be5")
	ColorMap.put("light-blue darken-2", "#0288d1")
	ColorMap.put("light-blue darken-3", "#0277bd")
	ColorMap.put("light-blue darken-4", "#01579b")
	ColorMap.put("light-blue accent-1", "#80d8ff")
	ColorMap.put("light-blue accent-2", "#40c4ff")
	ColorMap.put("light-blue accent-3", "#00b0ff")
	ColorMap.put("light-blue accent-4", "#0091ea")
	ColorMap.put("cyan lighten-5", "#e0f7fa")
	ColorMap.put("cyan lighten-4", "#b2ebf2")
	ColorMap.put("cyan lighten-3", "#80deea")
	ColorMap.put("cyan lighten-2", "#4dd0e1")
	ColorMap.put("cyan lighten-1", "#26c6da")
	ColorMap.put("cyan", "#00bcd4")
	ColorMap.put("cyan darken-1", "#00acc1")
	ColorMap.put("cyan darken-2", "#0097a7")
	ColorMap.put("cyan darken-3", "#00838f")
	ColorMap.put("cyan darken-4", "#006064")
	ColorMap.put("cyan accent-1", "#84ffff")
	ColorMap.put("cyan accent-2", "#18ffff")
	ColorMap.put("cyan accent-3", "#00e5ff")
	ColorMap.put("cyan accent-4", "#00b8d4")
	ColorMap.put("teal lighten-5", "#e0f2f1")
	ColorMap.put("teal lighten-4", "#b2dfdb")
	ColorMap.put("teal lighten-3", "#80cbc4")
	ColorMap.put("teal lighten-2", "#4db6ac")
	ColorMap.put("teal lighten-1", "#26a69a")
	ColorMap.put("teal", "#009688")
	ColorMap.put("teal darken-1", "#00897b")
	ColorMap.put("teal darken-2", "#00796b")
	ColorMap.put("teal darken-3", "#00695c")
	ColorMap.put("teal darken-4", "#004d40")
	ColorMap.put("teal accent-1", "#a7ffeb")
	ColorMap.put("teal accent-2", "#64ffda")
	ColorMap.put("teal accent-3", "#1de9b6")
	ColorMap.put("teal accent-4", "#00bfa5")
	ColorMap.put("green lighten-5", "#e8f5e9")
	ColorMap.put("green lighten-4", "#c8e6c9")
	ColorMap.put("green lighten-3", "#a5d6a7")
	ColorMap.put("green lighten-2", "#81c784")
	ColorMap.put("green lighten-1", "#66bb6a")
	ColorMap.put("green", "#4caf50")
	ColorMap.put("green darken-1", "#43a047")
	ColorMap.put("green darken-2", "#388e3c")
	ColorMap.put("green darken-3", "#2e7d32")
	ColorMap.put("green darken-4", "#1b5e20")
	ColorMap.put("green accent-1", "#b9f6ca")
	ColorMap.put("green accent-2", "#69f0ae")
	ColorMap.put("green accent-3", "#00e676")
	ColorMap.put("green accent-4", "#00c853")
	ColorMap.put("light-green lighten-5", "#f1f8e9")
	ColorMap.put("light-green lighten-4", "#dcedc8")
	ColorMap.put("light-green lighten-3", "#c5e1a5")
	ColorMap.put("light-green lighten-2", "#aed581")
	ColorMap.put("light-green lighten-1", "#9ccc65")
	ColorMap.put("light-green", "#8bc34a")
	ColorMap.put("light-green darken-1", "#7cb342")
	ColorMap.put("light-green darken-2", "#689f38")
	ColorMap.put("light-green darken-3", "#558b2f")
	ColorMap.put("light-green darken-4", "#33691e")
	ColorMap.put("light-green accent-1", "#ccff90")
	ColorMap.put("light-green accent-2", "#b2ff59")
	ColorMap.put("light-green accent-3", "#76ff03")
	ColorMap.put("light-green accent-4", "#64dd17")
	ColorMap.put("lime lighten-5", "#f9fbe7")
	ColorMap.put("lime lighten-4", "#f0f4c3")
	ColorMap.put("lime lighten-3", "#e6ee9c")
	ColorMap.put("lime lighten-2", "#dce775")
	ColorMap.put("lime lighten-1", "#d4e157")
	ColorMap.put("lime", "#cddc39")
	ColorMap.put("lime darken-1", "#c0ca33")
	ColorMap.put("lime darken-2", "#afb42b")
	ColorMap.put("lime darken-3", "#9e9d24")
	ColorMap.put("lime darken-4", "#827717")
	ColorMap.put("lime accent-1", "#f4ff81")
	ColorMap.put("lime accent-2", "#eeff41")
	ColorMap.put("lime accent-3", "#c6ff00")
	ColorMap.put("lime accent-4", "#aeea00")
	ColorMap.put("yellow lighten-5", "#fffde7")
	ColorMap.put("yellow lighten-4", "#fff9c4")
	ColorMap.put("yellow lighten-3", "#fff59d")
	ColorMap.put("yellow lighten-2", "#fff176")
	ColorMap.put("yellow lighten-1", "#ffee58")
	ColorMap.put("yellow", "#ffeb3b")
	ColorMap.put("yellow darken-1", "#fdd835")
	ColorMap.put("yellow darken-2", "#fbc02d")
	ColorMap.put("yellow darken-3", "#f9a825")
	ColorMap.put("yellow darken-4", "#f57f17")
	ColorMap.put("yellow accent-1", "#ffff8d")
	ColorMap.put("yellow accent-2", "#ffff00")
	ColorMap.put("yellow accent-3", "#ffea00")
	ColorMap.put("yellow accent-4", "#ffd600")
	ColorMap.put("amber lighten-5", "#fff8e1")
	ColorMap.put("amber lighten-4", "#ffecb3")
	ColorMap.put("amber lighten-3", "#ffe082")
	ColorMap.put("amber lighten-2", "#ffd54f")
	ColorMap.put("amber lighten-1", "#ffca28")
	ColorMap.put("amber", "#ffc107")
	ColorMap.put("amber darken-1", "#ffb300")
	ColorMap.put("amber darken-2", "#ffa000")
	ColorMap.put("amber darken-3", "#ff8f00")
	ColorMap.put("amber darken-4", "#ff6f00")
	ColorMap.put("amber accent-1", "#ffe57f")
	ColorMap.put("amber accent-2", "#ffd740")
	ColorMap.put("amber accent-3", "#ffc400")
	ColorMap.put("amber accent-4", "#ffab00")
	ColorMap.put("orange lighten-5", "#fff3e0")
	ColorMap.put("orange lighten-4", "#ffe0b2")
	ColorMap.put("orange lighten-3", "#ffcc80")
	ColorMap.put("orange lighten-2", "#ffb74d")
	ColorMap.put("orange lighten-1", "#ffa726")
	ColorMap.put("orange", "#ff9800")
	ColorMap.put("orange darken-1", "#fb8c00")
	ColorMap.put("orange darken-2", "#f57c00")
	ColorMap.put("orange darken-3", "#ef6c00")
	ColorMap.put("orange darken-4", "#e65100")
	ColorMap.put("orange accent-1", "#ffd180")
	ColorMap.put("orange accent-2", "#ffab40")
	ColorMap.put("orange accent-3", "#ff9100")
	ColorMap.put("orange accent-4", "#ff6d00")
	ColorMap.put("deep-orange lighten-5", "#fbe9e7")
	ColorMap.put("deep-orange lighten-4", "#ffccbc")
	ColorMap.put("deep-orange lighten-3", "#ffab91")
	ColorMap.put("deep-orange lighten-2", "#ff8a65")
	ColorMap.put("deep-orange lighten-1", "#ff7043")
	ColorMap.put("deep-orange", "#ff5722")
	ColorMap.put("deep-orange darken-1", "#f4511e")
	ColorMap.put("deep-orange darken-2", "#e64a19")
	ColorMap.put("deep-orange darken-3", "#d84315")
	ColorMap.put("deep-orange darken-4", "#bf360c")
	ColorMap.put("deep-orange accent-1", "#ff9e80")
	ColorMap.put("deep-orange accent-2", "#ff6e40")
	ColorMap.put("deep-orange accent-3", "#ff3d00")
	ColorMap.put("deep-orange accent-4", "#dd2c00")
	ColorMap.put("brown lighten-5", "#efebe9")
	ColorMap.put("brown lighten-4", "#d7ccc8")
	ColorMap.put("brown lighten-3", "#bcaaa4")
	ColorMap.put("brown lighten-2", "#a1887f")
	ColorMap.put("brown lighten-1", "#8d6e63")
	ColorMap.put("brown", "#795548")
	ColorMap.put("brown darken-1", "#6d4c41")
	ColorMap.put("brown darken-2", "#5d4037")
	ColorMap.put("brown darken-3", "#4e342e")
	ColorMap.put("brown darken-4", "#3e2723")
	ColorMap.put("grey lighten-5", "#fafafa")
	ColorMap.put("grey lighten-4", "#f5f5f5")
	ColorMap.put("grey lighten-3", "#eeeeee")
	ColorMap.put("grey lighten-2", "#e0e0e0")
	ColorMap.put("grey lighten-1", "#bdbdbd")
	ColorMap.put("grey", "#9e9e9e")
	ColorMap.put("grey darken-1", "#757575")
	ColorMap.put("grey darken-2", "#616161")
	ColorMap.put("grey darken-3", "#424242")
	ColorMap.put("grey darken-4", "#212121")
	ColorMap.put("blue-grey lighten-5", "#eceff1")
	ColorMap.put("blue-grey lighten-4", "#cfd8dc")
	ColorMap.put("blue-grey lighten-3", "#b0bec5")
	ColorMap.put("blue-grey lighten-2", "#90a4ae")
	ColorMap.put("blue-grey lighten-1", "#78909c")
	ColorMap.put("blue-grey", "#607d8b")
	ColorMap.put("blue-grey darken-1", "#546e7a")
	ColorMap.put("blue-grey darken-2", "#455a64")
	ColorMap.put("blue-grey darken-3", "#37474f")
	ColorMap.put("blue-grey darken-4", "#263238")
	ColorMap.put("black", "#000000")
	ColorMap.put("white", "#ffffff")
	ColorMap.put("transparent", "transparent")
	'
	TargetOptions.Put("","None")
	TargetOptions.Put("_blank","Blank")
	TargetOptions.Put("_self","Self")
	TargetOptions.Put("_parent","Parent")
	TargetOptions.Put("_top","Top")
	'
	ColumnTypes.Initialize
	ColumnTypes.put("date","Date")
	ColumnTypes.put("text", "Text")
	ColumnTypes.put("icon", "Icon")
	ColumnTypes.put("checkbox", "Check Box")
	ColumnTypes.put("", "None")
	ColumnTypes.put("time","Time")
	ColumnTypes.put("datetime","Date Time")
	ColumnTypes.put("image","Image")
	ColumnTypes.Put("money","Money")
	ColumnTypes.put("filesize", "File Size")
	ColumnTypes.put("chip","Chip")
	ColumnTypes.put("action","Action")
	'
	ColumnAlign.Initialize
	ColumnAlign.Put("start", "Start")
	ColumnAlign.Put("center", "Center")
	ColumnAlign.Put("end", "End")
	'
	DataTypes.Initialize
	DataTypes.Put("BOOL", "Boolean")
	DataTypes.Put("INT", "Integer")
	DataTypes.Put("TEXT", "Text")
	DataTypes.Put("FLOAT", "Double")
	DataTypes.Put("BLOB", "Blob")
	DataTypes.Put("DATE", "Date")
	DataTypes.Put("None", "None")
	'
	HashType.Initialize
	HashType.Put("MD5", "MD5")
	HashType.Put("SHA1", "SHA1")
	HashType.Put("SHA256", "SHA256")
	HashType.Put("SHA512", "SHA512")
	HashType.Put("RMD160", "RMD160")
	HashType.Put("", "None")
	 
	Algorithm.Initialize
	Algorithm.Put("hex", "hex")
	Algorithm.Put("b64", "b64")
	Algorithm.Put("hex_hmac", "hex_hmac")
	Algorithm.Put("b64_hmac", "b64_hmac")
	Algorithm.Put("", "None")
	'
	ControlTypes.Initialize
	ControlTypes.put("text", "Text")
	ControlTypes.put("textarea", "Text Area")
	ControlTypes.put("checkbox", "Check Box")
	ControlTypes.put("date", "Date")
	ControlTypes.put("file", "File")
	ControlTypes.put("radio", "Radio")
	ControlTypes.put("select", "Select")
	ControlTypes.put("slider", "Slider")
	ControlTypes.put("switch", "Switch")
	ControlTypes.put("label", "Label")
	ControlTypes.put("email", "Email")
	ControlTypes.put("rating", "Rating")
	ControlTypes.put("password", "Password")
	ControlTypes.put("tel", "Telephone")
	ControlTypes.put("time", "Time")
	ControlTypes.put("combo", "Combo")
	ControlTypes.put("auto", "Auto Complete")
	ControlTypes.put("profile", "Profile")
	ControlTypes.put("image", "Image")
	ControlTypes.put("button", "Button")
	ControlTypes.put("icon", "Icon")
	ControlTypes.put("parallax", "Parallax")
	ControlTypes.put("container", "Container")
	ControlTypes.put("menu", "Menu")
	ControlTypes.put("carousel", "Carousel")
	ControlTypes.put("speeddial", "Speed Dial")
	ControlTypes.Put("quill", "Quill Editor")
	ControlTypes.Put("None", "None")
	'
	SetBeforeCreate(Module, "BeforeCreate")
	SetCreated(Module, "Created")
	SetBeforeMount(Module, "BeforeMount")
	SetMounted(Module, "Mounted")
	SetBeforeUpdate(Module, "BeforeUpdate")
	SetUpdated(Module, "Updated")
	SetBeforeDestroy(Module, "BeforeDestroy")
	SetDestroyed(Module, "Destroyed")
	'
	'If SubExists(Module, "ReadyChange") = False Then
	'	Log("Initialize.ReadyChange - please consider adding this optional callback!")
	'End If
	
	If SubExists(Module, "BeforeCreate") = False Then
		Log("Initialize.BeforeCreate - please consider adding this optional callback!")
	End If
	'
	If SubExists(Module, "Created") = False Then
		Log("Initialize.Created - please consider adding this optional callback!")
	End If
	'
	If SubExists(Module, "BeforeMount") = False Then
		Log("Initialize.BeforeMount - please consider adding this optional callback!")
	End If
	'
	If SubExists(Module, "Mounted") = False Then
		Log("Initialize.Mounted - please consider adding this optional callback!")
	End If
	'
	If SubExists(Module, "BeforeUpdate") = False Then
		Log("Initialize.BeforeUpdate - please consider adding this optional callback!")
	End If
	'
	If SubExists(Module, "Updated") = False Then
		Log("Initialize.Updated - please consider adding this optional callback!")
	End If
	'
	If SubExists(Module, "BeforeDestroy") = False Then
		Log("Initialize.BeforeDestroy - please consider adding this optional callback!")
	End If
	'
	If SubExists(Module, "Destroyed") = False Then
		Log("Initialize.Destroyed - please consider adding this optional callback!")
	End If
End Sub

#if css
.preloadcontainer {
    height: 100vh;
    width: 100vw;
    font-family: Helvetica
}

.loader {
    height: 20px;
    width: 250px;
    position: absolute;
    top: 0;
    bottom: 0;
    left: 0;
    right: 0;
    margin: auto
}

.loader--dot {
    animation-name: loader;
    animation-timing-function: ease-in-out;
    animation-duration: 3s;
    animation-iteration-count: infinite;
    height: 20px;
    width: 20px;
    border-radius: 100%;
    background-color: #000;
    position: absolute;
    border: 2px solid #fff
}

.loader--dot:first-child {
    background-color: #8cc759;
    animation-delay: .5s
}

.loader--dot:nth-child(2) {
    background-color: #8c6daf;
    animation-delay: .4s
}

.loader--dot:nth-child(3) {
    background-color: #ef5d74;
    animation-delay: .3s
}

.loader--dot:nth-child(4) {
    background-color: #f9a74b;
    animation-delay: .2s
}

.loader--dot:nth-child(5) {
    background-color: #60beeb;
    animation-delay: .1s
}

.loader--dot:nth-child(6) {
    background-color: #fbef5a;
    animation-delay: 0s
}

.loader--text {
    position: absolute;
    top: 200%;
    left: 0;
    right: 0;
    width: 4rem;
    margin: auto
}

.loader--text:after {
    content: "Loading";
    font-weight: 700;
    animation-name: loading-text;
    animation-duration: 3s;
    animation-iteration-count: infinite
}

@keyframes loader {
    15% {
        transform: translateX(0)
    }

    45% {
        transform: translateX(230px)
    }

    65% {
        transform: translateX(230px)
    }

    95% {
        transform: translateX(0)
    }
}

@keyframes loading-text {
    0% {
        content: "Loading"
    }

    25% {
        content: "Loading."
    }

    50% {
        content: "Loading.."
    }

    75% {
        content: "Loading..."
    }
}
#End If

#if javascript
	var pl = document.createElement("div");
	pl.id = "preloader";
	pl.className = "preloadcontainer";
	var ldr = document.createElement("div");
	ldr.className = "loader";
	var dot = document.createElement("div");
	dot.className = "loader--dot";
	var lot = document.createElement("div");
	lot.className = "loader--text";
	ldr.appendChild(dot.cloneNode(true));
	ldr.appendChild(dot.cloneNode(true));
	ldr.appendChild(dot.cloneNode(true));
	ldr.appendChild(dot.cloneNode(true));
	ldr.appendChild(dot.cloneNode(true));
	ldr.appendChild(dot.cloneNode(true));
	ldr.appendChild(lot);
	pl.appendChild(ldr);
	document.body.appendChild(pl);
	 
	document.onreadystatechange = function() { 
            if (document.readyState !== "complete") { 
                document.querySelector("body").style.visibility = "hidden"; 
                document.querySelector("#preloader").style.visibility = "visible"; 
            } else { 
                // document.querySelector("#preloader").style.display = "none"; 
                // document.querySelector("body").style.visibility = "visible"; 
            } 
        }; 
#End If

'get document ready state
Sub GetReadyState As String
	Dim rs As String = BANAno.Window.GetField("document").GetField("readyState").Result
	Return rs
End Sub

'set ready change event
Sub SetOnReadyChange(EventHandler As Object) As BANanoVue
	If SubExists(EventHandler, "ReadyChange") = False Then Return Me
	Dim cb As BANanoObject = BANAno.callback(EventHandler, "ReadyChange", Null)
	BANAno.Window.GetField("document").AddEventListener("readystatechange", cb, True)
	Return Me
End Sub
'
private Sub HideBody As BANanoVue
	Dim stylem As Map = CreateMap("visibility":"hidden")
	body.SetStyle(BANAno.ToJson(stylem))
	Return Me
End Sub


private Sub ShowBody As BANanoVue
	Dim stylem As Map = CreateMap("visibility":"visible")
	body.SetStyle(BANAno.ToJson(stylem))
	Return Me
End Sub


Sub ShowPreloader As BANanoVue
	Dim stylem As Map = CreateMap("visibility":"visible")
	BANAno.GetElement("#preloader").SetStyle(BANAno.ToJson(stylem))
	HideBody
	Return Me
End Sub


Sub HidePreloader As BANanoVue
	Dim stylem As Map = CreateMap("display":"none")
	BANAno.GetElement("#preloader").SetStyle(BANAno.ToJson(stylem))
	ShowBody
	Return Me
End Sub

Sub RemovePreloader
	BANAno.GetElement("#preloader").Remove
End Sub

'add an error to the collection
Sub AddError(vmodel As String, vError As String)
	vmodel = vmodel.tolowercase
	Errors.Put(vmodel, vError)
End Sub

Sub SourceCodeBuilder
	SourceCode.Initialize
End Sub

Sub AddNewLine
	SourceCode.append(CRLF)
End Sub

Sub AddCode(scomment As String)
	SourceCode.append(scomment).append(CRLF)
End Sub

Sub AddComment(sc As String)
	SourceCode.append($"'${sc}"$).append(CRLF)
End Sub

Sub AddNewLine1(sbx As StringBuilder)
	sbx.append(CRLF)
End Sub

Sub AddCode1(sbx As StringBuilder, scomment As String)
	sbx.append(scomment).append(CRLF)
End Sub

Sub AddComment1(sbx As StringBuilder, sc As String)
	sbx.append($"'${sc}"$).append(CRLF)
End Sub

Sub GetSourceCode As String
	Return SourceCode.tostring
End Sub

Sub YesNoToBoolean(xvalue As String) As Boolean
	Select Case xvalue
		Case "Yes","yes"
			Return True
		Case Else
			Return False
	End Select
End Sub

Sub AddModule(tagName As String) As BANanoVue
	tagName = tagName.tolowercase
	Modules.Put(tagName, tagName)
	Return Me
End Sub

Sub DateIsAfter(date1 As String, date2 As String) As Boolean
	Dim d1 As Int = DateIconv(date1)
	Dim d2 As Int = DateIconv(date2)
	d1 = BANAno.parseint(d1)
	d2 = BANAno.parseInt(d2)
	Dim b As Boolean = BANAno.IIf(d1 > d2, True, False)
	Return b
End Sub

Sub ModuleExist(tagName As String) As Boolean
	tagName = tagName.tolowercase
	Dim b As Boolean = Modules.ContainsKey(tagName)
	Return b
End Sub

'remove the delimiter from stringbuilder
Sub RemDelim(sValue As String, Delim As String) As String
	Dim sw As Boolean = sValue.EndsWith(Delim)
	If sw Then
		Dim lDelim As Int = Delim.Length
		Dim nValue As String = sValue
		sw = nValue.EndsWith(Delim)
		If sw Then
			nValue = nValue.SubString2(0, nValue.Length-lDelim)
		End If
		Return nValue
	Else
		Return sValue
	End If
End Sub

Sub DateIconv(sdate As String) As Long
	Dim lps As Long = DateTime.DateParse(sdate)
	Return lps
End Sub

Sub DateOconv(lDate As Long) As String
	DateTime.DateFormat = "yyyy-MM-dd"
	Dim sdate As String = DateTime.Date(lDate)
	Return sdate
End Sub

'break a string at uppercase to have a space
Sub StringBreakAtUpperCase(st As String) As String
	If st.Length = 0 Then Return ""
	Dim k As Int
	Dim s As String
	Dim newst As String = st.CharAt(0)
	For i = 1 To st.Length - 1
		s = st.CharAt(i)
		k = Asc(s)
		If (k > 64) And (k < 91) And (st.CharAt(i-1) <> " ") Then
			newst = newst & " " & s
		Else
			newst = newst & s
		End If
	Next
	Return newst
End Sub

Sub JoinMapKeys(m As Map, delim As String) As String
	Dim sb As StringBuilder
	sb.Initialize
	Dim kTot As Int = m.Size - 1
	Dim kCnt As Int
	Dim strKey As String = m.getkeyat(0)
	sb.Append(strKey)
	For kCnt = 1 To kTot
		Dim strKey As String = m.getkeyat(kCnt)
		sb.Append(delim).append(strKey)
	Next
	Return sb.ToString
End Sub

'return sentences of lorem ipsum
Sub Rand_LoremIpsum(count As Int) As String
	Dim str As String = $"Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."$
	Dim sb As StringBuilder
	sb.Initialize
	For i = 1 To count
		sb.Append(str).Append(CRLF)
	Next
	Return sb.tostring
End Sub

Sub NewList As List
	Dim lst As List
	lst.Initialize
	Return lst
End Sub

'get the record position from saved items
Sub ListOfMapsRecordPos(lst As List, k As String, v As String) As Int
	Dim lTot As Int = lst.Size - 1
	Dim lCnt As Int
	For lCnt = 0 To lTot
		Dim m As Map = lst.Get(lCnt)
		Dim sk As String = m.GetDefault(k, "")
		If sk.EqualsIgnoreCase(v) Then
			Return lCnt
		End If
	Next
	Return -1
End Sub

'join list to mv string
Sub Join(delimiter As String, lst As List) As String
	If lst.Size = 0 Then Return ""
	Dim i As Int
	Dim sb As StringBuilder
	Dim fld As String
	sb.Initialize
	fld = lst.Get(0)
	sb.Append(fld)
	For i = 1 To lst.size - 1
		Dim fld As String = lst.Get(i)
		sb.Append(delimiter).Append(fld)
	Next
	Return sb.ToString
End Sub

'convert delimited values and keys to a map
Sub KeyValues2Map(delim As String, keys As String, values As String) As Map
	Dim rkeys As List = StrParse(delim, keys)
	Dim rvalues As List = StrParse(delim, values)
	'
	Dim optm As Map = CreateMap()
	
	Dim rTot As Int = rkeys.Size -1
	Dim vTot As Int = rvalues.Size - 1
	If rTot <> vTot Then
	Else
		Dim rCnt As Int
		For rCnt = 0 To rTot
			Dim k As String = rkeys.Get(rCnt)
			Dim v As String = rvalues.Get(rCnt)
			optm.put(k, v)
		Next
	End If
	Return optm
End Sub

Sub NewMap As Map
	Dim nm As Map
	nm.Initialize
	Return nm
End Sub

'javascript getElementById
Sub getElementById(sid As String) As BANanoObject
	Dim el As BANanoObject = BANAno.Window.GetField("document").RunMethod("getElementById", Array(sid))
	Return el
End Sub
'
'Sub DateDiff(currentDate As String, otherDate As String) As Int
'	Dim dateS, dateE As BANanoObject
'	dateS.Initialize4("moment", currentDate)
'	dateE.Initialize4("moment", otherDate)
'	Return dateS.RunMethod("diff", Array(dateE, "days"))
'End Sub

Sub RemoveData(key As String) As BANanoVue
	key = key.ToLowerCase
	data.Remove(key)
	Return Me
End Sub

Sub SetData(prop As String, valuex As Object) As BANanoVue
	SetStateSingle(prop, valuex)
	Return Me
End Sub

Sub GetData(prop As String) As Object
	Dim obj As Object = GetState(prop, Null)
	Return obj
End Sub

Sub ListRemoveDuplicates(lst As List) As List
	Dim nd As Map = CreateMap()
	For Each k As String In lst
		nd.Put(k, k)
	Next
	Dim nl As List
	nl.Initialize
	For Each k As String In nd.Keys
		nl.Add(k)
	Next
	nl.Sort(True)
	Return nl
End Sub

Sub ShowMulti(lst As List)
	For Each item As String In lst
		ShowItem(item)
	Next
End Sub

Sub HideMulti(lst As List)
	For Each item As String In lst
		HideItem(item)
	Next
End Sub

Sub GetFileDetails(fileObj As Map) As FileObject
	Dim sname As String = fileObj.Get("name")
	Dim slastModifiedDate As BANanoObject = fileObj.Get("lastModifiedDate")
	Dim ssize As String = fileObj.Get("size")
	Dim stype As String = fileObj.Get("type")
	'
	Dim yyyy As String = slastModifiedDate.RunMethod("getFullYear", Null).Result
	Dim dd As String = slastModifiedDate.RunMethod("getDate", Null).Result
	Dim mm As String = slastModifiedDate.RunMethod("getMonth", Null).Result
	Dim hh As String = slastModifiedDate.RunMethod("getHours", Null).Result
	Dim minutes As String = slastModifiedDate.RunMethod("getMinutes", Null).Result
	'pad the details
	dd = PadRight(dd, 2, "0")
	mm = PadRight(mm, 2, "0")
	hh = PadRight(hh, 2, "0")
	minutes = PadRight(minutes, 2, "0")
	'
	Dim fd As String = $"${yyyy}-${mm}-${dd} ${hh}:${minutes}"$
	'
	
	Dim ff As FileObject
	ff.Initialize
	ff.FileName = sname
	ff.FileDate = fd
	ff.FileSize = ssize
	ff.FileType = stype
	Return ff
End Sub


Sub BeautifySourceCode(slang As String, sc As String) As String
	Select Case slang
	Case "js"
		Dim res As String = BANAno.RunJavascriptMethod("js_beautify", Array(sc))
	Case "css"
		Dim res As String = BANAno.RunJavascriptMethod("css_beautify", Array(sc))
	Case "html"
		Dim res As String = BANAno.RunJavascriptMethod("html_beautify", Array(sc))
	End Select
	Return res
End Sub

Sub AddStyle(sID As String, opt As Map) As BANanoVue
	Dim nm As Map = CreateMap()
	sID = sID.ToLowerCase
	Dim oldm As Map = GetState(sID, nm)
	For Each k As String In opt.Keys
		Dim v As Object = opt.Get(k)
		oldm.Put(k, v)
	Next
	SetStateSingle(sID, oldm)
	Return Me
End Sub

Sub AddStyleSingle(sID As String, prop As String, opt As String) As BANanoVue
	Dim nm As Map = CreateMap()
	nm.Put(prop, opt)
	AddStyle(sID, nm)
	Return Me
End Sub

'Sub UploadFile(fileObj As Object)
'	BANAno.RunJavascriptMethod("uploadFile", Array(fileObj))
'End Sub

private Sub DoUpload(fileObj As Object) As String   'ignore
	Dim aEvt As Object
	Dim xhr As BANanoXMLHttpRequest
	'define form data
	Dim fd As BANanoObject
	fd.Initialize2("FormData",Null)
	fd.RunMethod("append", Array("upload", fileObj))
	'
	xhr.Initialize
	xhr.Open("POST", "./assets/upload.php")
	xhr.AddEventListenerOpenAsync("onreadystatechange", aEvt)
	If xhr.ReadyState = 4 Then
		If xhr.Status = 200 Then
			BANAno.ReturnThen(xhr.ResponseText)
		Else
			Dim err As Map = CreateMap()
			err.Put("status", "error")
			Dim serr As String = BANAno.ToJson(err)
			BANAno.ReturnElse(serr)
		End If
	End If
	xhr.CloseEventListener
	xhr.Send2(fd)
End Sub

Sub HTTPUpload(fileObj As Object, module As Object, methodname As String)
	Dim promise As BANanoPromise 'ignore
	' some vars to hold our results
	Dim Error As String
	Dim json As String
	
	' call the http request
	promise.CallSub(Me, "DoUpload", Array(fileObj))
	promise.ThenWait(json)
	BANAno.CallSub(module, methodname, Array(fileObj, json))
	promise.ElseWait(Error)  'ignore
	BANAno.CallSub(module, methodname, Array(fileObj, Error))
	promise.End
End Sub


'copy a state from one to another
Sub State2Another(source As String, target As String, defaultValue As Object)
	Dim readObj As Object = GetState(source, defaultValue)
	SetStateSingle(target, readObj)
End Sub


Public Sub GetAlphabets(value As String) As String
	value = CStr(value)
	Try
		value = value.Trim
		If value = "" Then value = ""
		Dim sout As String = ""
		Dim mout As String = ""
		Dim slen As Int = value.Length
		Dim i As Int = 0
		For i = 0 To slen - 1
			mout = value.CharAt(i)
			If InStr("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ", mout) <> -1 Then
				sout = sout & mout
			End If
		Next
		Return sout
	Catch
		Return value
	End Try
End Sub

'return a pretty json from something
Sub JSONPretty(m As Object) As String
	Dim pretty As String = BANAno.RunJavascriptMethod("JSON.stringify", Array(m, Null, 4))
	Return pretty
End Sub

'create a map subset from list of keys
Sub ExtractMap(source As Map, keys As List) As Map
	Dim nm As Map = CreateMap()
	For Each k As String In keys
		Dim v As Object = source.get(k)
		nm.put(k, v)
	Next
	Return nm
End Sub

Sub InStr(Text As String, sFind As String) As Int
	Return Text.tolowercase.IndexOf(sFind.tolowercase)
End Sub

'join list to mv string
Sub JoinNonBlanks(delimiter As String, lst As List) As String
	If lst.size = 0 Then Return ""
	'ensure we have non blanks
	Dim nl As List
	nl.Initialize
	For Each str As String In lst
		str = str.Trim
		If str.Length > 0 Then
			nl.Add(str)
		End If
	Next
	If nl.Size = 0 Then Return ""
	'
	Dim i As Int
	Dim sb As StringBuilder
	Dim fld As String
	sb.Initialize
	fld = nl.Get(0)
	sb.Append(fld)
	For i = 1 To nl.size - 1
		Dim fld As String = nl.Get(i)
		sb.Append(delimiter).Append(fld)
	Next
	Return sb.ToString
End Sub


'join maps
Sub JoinMaps(lst As List) As Map
	Dim nm As Map = CreateMap()
	If lst.Size = 0 Then Return nm
	For Each mr As Map In lst
		For Each k As String In mr.Keys
			Dim v As Object = mr.Get(k)
			nm.Put(k, v)
		Next
	Next
	Return nm
End Sub

'join lists
Sub JoinLists(lst As List) As List
	Dim nl As List
	nl.Initialize
	For Each lo As List In lst
		For Each k As Object In lo
			nl.Add(k)
		Next
	Next
	Return nl
End Sub


'convert map keys to a list
Sub MapKeys2List(m As Map) As List
	Dim lst As List
	lst.Initialize
	For Each k As String In m.Keys
		lst.Add(k)
	Next
	Return lst
End Sub

'convert map keys to a list
Sub MapValues2List(m As Map) As List
	Dim lst As List
	lst.Initialize
	For Each k As String In m.values
		lst.Add(k)
	Next
	Return lst
End Sub


'rsa id to date of birth
Sub RSAIDNumber2DateOfBirth(rsaID As String) As String
	'south african id
	If rsaID.length = 13 Then
		Dim yymmdd As String = LeftString(rsaID, 6)
		Dim yy As String = LeftString(yymmdd,2)
		Dim mm As String = MidString(yymmdd,3,2)
		Dim dd As String = RightString(yymmdd,2)
		yymmdd = $"19${yy}-${mm}-${dd}"$
		Return yymmdd
	Else
		Return ""
	End If
End Sub

Public Sub YearNow() As String
	Dim lNow As Long
	Dim dt As String
	lNow = DateTime.Now
	DateTime.DateFormat = "yyyy"
	dt = DateTime.Date(lNow)
	Return dt
End Sub

Public Sub MonthNow() As String
	Dim lNow As Long
	Dim dt As String
	lNow = DateTime.Now
	DateTime.DateFormat = "M"
	dt = DateTime.Date(lNow)
	Return dt
End Sub

Sub DateAdd(mDate As String, HowManyDays As Int) As String
	HowManyDays = BANAno.parseInt(HowManyDays)
	Dim ConvertDate, NewDateDay As Long
	ConvertDate = DateTime.DateParse(mDate)
	NewDateDay = DateTime.Add(ConvertDate, 0, 0, HowManyDays)
	Return DateTime.Date(NewDateDay)
End Sub

'Returns the number of days that have passed between two dates.
'Pass the dates as a String
Sub NumberOfDaysBetweenDates(CurrentDate As String, OtherDate As String) As Int
	Dim CurrDate, OthDate As Long
	CurrDate = DateTime.DateParse(CurrentDate)
	OthDate = DateTime.DateParse(OtherDate)
	Dim tpd As Long = DateTime.TicksPerDay
	Dim iOut As Long = (CurrDate - OthDate)/tpd
	Return iOut
End Sub

Public Sub CDbl(value As String) As Double
	Try
		value = value.Trim
		If value = "" Then value = "0"
		value = value.Replace(",","")
		Dim out As Double = NumberFormat2(value,0,2,2,False)
		Return out
	Catch
		Return value
	End Try
End Sub


Sub ProjectDays(sDays As String) As String
	Try
		sDays = sDays.trim
		If sDays = "" Then sDays = "0"
		sDays = sDays.Replace(",","")
		sDays = NumberFormat2(sDays,0,0,0,True)
		Return sDays & " Dys"
	Catch
		Return "0 Dys"
	End Try
End Sub

Sub ProjectDate(sDate As String) As String
	If sDate.Length = 0 Then Return ""
	Try
		DateTime.DateFormat = "yyyy-MM-dd"
		Dim dt As Long = DateTime.DateParse(sDate)
		DateTime.DateFormat = "dd-MMM-yyyy, EEE"
		Return DateTime.Date(dt)
	Catch
		Return ""
	End Try
End Sub


Sub FormatFileSize(Bytes As Float) As String
	Try
		Private Unit() As String = Array As String(" Byte", " KB", " MB", " GB", " TB", " PB", " EB", " ZB", " YB")
		If Bytes = 0 Then
			Return "0 Bytes"
		Else
			Private Po, Si As Double
			Private I As Int
			Bytes = Abs(Bytes)
			I = Floor(Logarithm(Bytes, 1024))
			Po = Power(1024, I)
			Si = Bytes / Po
			Return NumberFormat(Si, 1, 3) & Unit(I)
		End If
	Catch
		Return "0 Bytes"
	End Try
End Sub

Sub InStrRev(value As String, search As String) As Long
	Return value.LastIndexOf(search) + 1
End Sub


'get the length of the string
Sub Len(Text As String) As Int
	Return Text.Length
End Sub

'pad things to the right
Sub PadRight(Value As String, MaxLen As Int, PadChar As String) As String
	Value = CStr(Value)
	Dim intOrdNoLen As Int = Len(Value)
	Dim i As Int
	For i = 1 To (MaxLen - intOrdNoLen) Step 1
		Value = PadChar & Value
	Next
	Return Value
End Sub

Sub GetListOfMapsProperty(lst As List, prop As String) As List
	prop = prop.tolowercase
	Dim kc As List
	kc.initialize
	For Each rec As Map In lst
		Dim v As String = rec.Get(prop)
		kc.add(v)
	Next
	Return kc
End Sub

'sum list of maps property
Sub SumListOfMapsProperty(lst As List, prop As String) As Double
	Dim tsum As Double = 0
	For Each rec As Map In lst
		Dim propv As String = rec.GetDefault(prop,"0")
		tsum = tsum + BANAno.parseFloat(propv)
	Next
	Return tsum
End Sub

'extract all numeric values from a string
Public Sub Val(value As String) As String
	value = CStr(value)
	Try
		value = value.Trim
		If value = "" Then value = "0"
		Dim sout As String = ""
		Dim mout As String = ""
		Dim slen As Int = value.Length
		Dim i As Int = 0
		For i = 0 To slen - 1
			mout = value.CharAt(i)
			If InStr("0123456789.-", mout) <> -1 Then
				sout = sout & mout
			End If
		Next
		Return sout
	Catch
		Return value
	End Try
End Sub

Public Sub Alpha(value As String) As String
	value = CStr(value)
	Try
		value = value.Trim
		If value = "" Then value = ""
		Dim sout As String = ""
		Dim mout As String = ""
		Dim slen As Int = value.Length
		Dim i As Int = 0
		For i = 0 To slen - 1
			mout = value.CharAt(i)
			If InStr("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", mout) <> -1 Then
				sout = sout & mout
			End If
		Next
		Return sout
	Catch
		Return value
	End Try
End Sub


'convert list of maps to key,value pairs
Sub List2KeyValues(lst As List, mapvalues As List) As List
	Return List2IDValue(lst, mapvalues)
End Sub

'convest list of maps to id & value
Sub List2IDValue(lst As List, mapValues As List) As List
	Dim mv1 As String = mapValues.get(0)
	Dim mv2 As String = mapValues.get(1)
	Dim nlst As List
	nlst.initialize
	For Each dict As Map In lst
		Dim mk As String = dict.get(mv1)
		Dim mv As String = dict.get(mv2)
		Dim nm As Map = CreateMap()
		nm.Put("id", mk)
		nm.put("value", mv)
		nlst.Add(nm)
	Next
	Return nlst
End Sub

Sub List2ArrayVariable(lst As List) As String
	If lst.Size = 0 Then
		Return $""""$
	End If
	Dim i As Int
	Dim sb As StringBuilder
	Dim fld As String
	sb.Initialize
	fld = lst.Get(0)
	fld = $""${fld}""$
	sb.Append(fld)
	For i = 1 To lst.size - 1
		Dim fld As String = lst.Get(i)
		fld = $""${fld}""$
		sb.Append(",").Append(fld)
	Next
	Return sb.ToString
End Sub


Sub JSONValues2LowerCase(sJSON As String, props As List) As String
	'convert json to map
	Dim jmap As Map = Json2Map(sJSON)
	MapValues2LowerCase(jmap, props)
	Dim nJSON As String = Map2Json(jmap)
	Return nJSON
End Sub


'convert a map to a json string using BANanoJSONGenerator
Sub Map2Json(mp As Map) As String
	Dim JSON As BANanoJSONGenerator
	JSON.Initialize(mp)
	Return JSON.ToString
End Sub

Sub Map2JsonPretty(mp As Map) As String
	Dim JSON As BANanoJSONGenerator
	JSON.Initialize(mp)
	Return JSON.ToPrettyString(4)
End Sub


'convert a json string to a map
Sub Json2Map(strJSON As String) As Map
	Dim json As BANanoJSONParser
	Dim Map1 As Map
	Map1.Initialize
	Map1.clear
	Try
		If strJSON.length > 0 Then
			json.Initialize(strJSON)
			Map1 = json.NextObject
		End If
		Return Map1
	Catch
		Return Map1
	End Try
End Sub

Sub NewDate(year As Int, month As Int, day As Int) As BANanoObject
	Dim dd As BANanoObject
	dd.Initialize2("Date", Array(year, month, day))
	Return dd
End Sub

Sub NewDateTime(year As Int, month As Int, day As Int, hour As Int, minute As Int) As BANanoObject
	Dim dd As BANanoObject
	dd.Initialize2("Date", Array(year, month, day, hour, minute))
	Return dd
End Sub

Sub Pad(Value As String, MaxLen As Int, PadChar As String, right As Boolean) As String
	Dim  intOrdNoLen As Int = Value.Length
	Dim i As Int
	For i = 1 To (MaxLen - intOrdNoLen) Step 1
		If right Then
			Value =  Value & PadChar
		Else
			Value = PadChar & Value
		End If
	Next
	Return Value
End Sub

Sub CLng(o As Object) As Long
	Return Floor(o)
End Sub

Sub CInt(o As Object) As Int
	Return Floor(o)
End Sub


'convert a list to json
Sub List2Json(mp As List) As String
	Dim JSON As BANanoJSONGenerator
	JSON.Initialize2(mp)
	Return JSON.ToString
End Sub

' convert a json string to a list
Sub Json2List(strValue As String) As List
	Dim lst As List
	lst.Initialize
	lst.clear
	If strValue.Length = 0 Then
		Return lst
	End If
	Try
		Dim parser As BANanoJSONParser
		parser.Initialize(strValue)
		Return parser.NextArray
	Catch
		Return lst
	End Try
End Sub

'convert map values to lowercase
Sub MapValues2LowerCase(m As Map, props As List)
	For Each prop As String In props
		If m.ContainsKey(prop) Then
			Dim v As String = m.GetDefault(prop,"")
			v = v.tolowercase
			m.Put(prop,v)
		End If
	Next
End Sub

Sub NumberSuffix(N As Double) As String
	If N < 0 Then
		Return "-" & NumberSuffix(-N)
	End If
	Dim Suffix() As String = Array As String("", "k", "M", "B", "T")
	Dim Thousands As Int = 0
	Do While N >= 1000 And Thousands < Suffix.Length - 1
		Thousands = Thousands + 1
		N = N / 1000
	Loop
	If Thousands = 0 Then
		Return NumberFormat2(N, 1, 2, 2, False)
	End If
 
	Dim MaxDecimalPlaces As Int = 0
	Do While MaxDecimalPlaces < 5
		Dim RelativeError As Double = Abs(N - Round2(N, MaxDecimalPlaces)) / N
		If RelativeError < 0.007 Then
			Exit
		End If
		MaxDecimalPlaces = MaxDecimalPlaces + 1
	Loop
	Return NumberFormat2(N, 1, 0, MaxDecimalPlaces, False) & Suffix(Thousands)
End Sub


Sub List2Array (a_lstArgs As List) As String()
	Dim arrArgs(a_lstArgs.Size) As String
	For i = 0 To arrArgs.Length - 1
		arrArgs(i) = a_lstArgs.Get(i)
	Next
	Return arrArgs
End Sub

Sub RandomString(iLength As Int, bLowerCase As Boolean, bUpperCase As Boolean, bNumbers As Boolean, AdditionalChars As String) As String
	Dim source As String
	If bLowerCase = True Then
		source = source &"abcdefghijklmnopqrstuvwxyz"
	End If
	If bUpperCase = True Then
		source = source &"ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	End If
	If bNumbers = True Then
		source = source &"0123456789"
	End If
	If AdditionalChars.Length > 0 Then
		source = source&AdditionalChars
	End If

	Dim SB As StringBuilder
	SB.Initialize
	For i = 1 To iLength
		Dim r As Int = Rnd(0,source.Length-1)
		SB.Append(source.SubString2(r,r+1))
	Next
	Return SB.ToString
End Sub

Sub GeneratePassword(IntNum As Int) As String
	Return RandomString(IntNum,True,True,True,"")
End Sub

'remove a delimiter from a string
Sub RemDelimSB(delimiter As String, value As StringBuilder) As StringBuilder
	If value.tostring.EndsWith(delimiter) = True Then
		Dim delimLen As Int = delimiter.length
		value.Remove(value.Length-delimLen,value.Length)
	End If
	Return value
End Sub


Sub Space(HM As Int) As String
	Dim RS As String = ""
	Do While Len(RS) < HM
		RS = RS & " "
	Loop
	Return RS
End Sub

Sub MakeMoney(sValue As String) As String
	If sValue.Length = 0 Then Return "0.00"
	If sValue = "null" Then sValue = "0.00"
	sValue = sValue.Replace(",","")
	sValue = Val(sValue)
	If sValue = "0" Then sValue = "000"
	sValue = Round2(sValue,2)
	Return NumberFormat2(sValue, 1, 2, 2, True)
End Sub

Sub Percentage(sValue As String) As String
	If sValue = "" Then sValue = "0.00"
	If sValue.Length = 0 Then Return "0.00"
	If sValue = "null" Then sValue = "0.00"
	sValue = sValue.Replace(",","")
	sValue = Val(sValue)
	If sValue = "0" Then sValue = "0.00"
	sValue = Round2(sValue,2)
	sValue = sValue & "%"
	Return sValue
End Sub

Sub MidString(Text As String, Start As Int, lLength As Int) As String
	Return Text.SubString2(Start-1,Start+lLength-1)
End Sub

Sub MidString2(Text As String, Start As Int) As String
	Return Text.SubString(Start-1)
End Sub

Sub RightString(Text As String, lLength As Long) As String
	If lLength>Text.Length Then lLength=Text.Length
	Return Text.SubString(Text.Length-lLength)
End Sub

Sub LeftString(Text As String, lLength As Long)As String
	If lLength>Text.Length Then lLength=Text.Length
	Return Text.SubString2(0, lLength)
End Sub

Sub ReplaceString(Text As String, sFind As String, sReplaceWith As String) As String
	Return Text.Replace(sFind, sReplaceWith)
End Sub

Sub LongDate(sDate As String) As String
	If sDate.Length = 0 Then Return ""
	Try
		DateTime.DateFormat = "yyyy-MM-dd"
		Dim dt As Long = DateTime.DateParse(sDate)
		DateTime.DateFormat = "EEEE, dd MMMM yyyy"
		Return DateTime.Date(dt)
	Catch
		Return ""
	End Try
End Sub

Sub LongDateTime(sDate As String) As String
	If sDate.Length = 0 Then Return ""
	Try
		DateTime.DateFormat = "yyyy-MM-dd HH:mm"
		Dim dt As Long = DateTime.DateParse(sDate)
		DateTime.DateFormat = "EEEE, dd MMMM yyyy HH:mm"
		Return DateTime.Date(dt)
	Catch
		Return ""
	End Try
End Sub

private Sub TrimString(strValue As String) As String
	Return strValue.trim
End Sub

Sub LCase(Text As String) As String
	Return Text.ToLowerCase
End Sub

Public Sub InQuotes(sValue As String) As String
	Return QUOTE & sValue & QUOTE
End Sub

Sub ProperCase(myStr As String) As String
	Try
		If myStr.trim.length = 0 Then Return ""
		Dim x As String
		Dim j, k As Int
		myStr = myStr.tolowercase
		x = myStr.ToUpperCase.CharAt(0)
		myStr = x & myStr.SubString2(1, myStr.Length)
		For j = 1 To myStr.Length
			k = myStr.IndexOf2(" ", j + 1)
			If k = -1 Then Exit
			x = myStr.ToUpperCase.CharAt(k + 1)
			myStr = myStr.SubString2(0, k + 1) & x & myStr.SubString2(k + 2, myStr.Length)
		Next
		Return myStr
	Catch
		Return myStr
	End Try
End Sub

'Sub BeautifyName1(namx As String) As String
'	namx = namx.trim
'	If namx = "" Then Return ""
'	Dim notCool As List
'	notCool.Initialize 
'	notCool.AddAll(Array("~", "`", "!" , "@" , "#" , "$" , "%", "^" , "&" , "*" , "(" , ")" , "-" , "_" , "+" , "=" , "{" , "}" , "|" , "\", "]", "["))
'	notCool.AddAll(Array(":", ";", "'", "<", ">", "," , ".", "?", "/"))
'	For Each cn As String In notCool
'		namx = namx.Replace(cn, " ")
'	Next
'	Dim sname As String = ProperCase(namx)
'	sname = sname.Replace(" ", "")
'	Return sname
'End Sub

Sub BeautifyName(idName As String) As String
	idName = idName.trim
	If idName = "" Then Return ""
	Dim ls As StringBuilder
	ls.Initialize 
	Dim slen As Int = idName.Length
	Dim i As Int = 0
	For i = 0 To slen - 1
		Dim mout As String = idName.CharAt(i)
		If "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".IndexOf(mout) = -1 Then
			ls.Append(" ")
		Else
			ls.Append(mout)
		End If
	Next
	Dim sname As String = ls.tostring
	sname = ProperCase(sname)
	sname = sname.Replace(" ", "")
	Return sname
End Sub

Sub Capitalize(t As String) As String
	Dim s , r , o As String
	s = t.SubString2(0,1)
	r = t.SubString2(1, t.Length)
	o = s.ToUpperCase & r
	Return o
End Sub

'lowercase map keys
Sub MapKeysLowerCaseSingle(m As Map) As Map
	Dim nm As Map = CreateMap()
	For Each k As String In m.Keys
		Dim v As Object = m.Get(k)
		k = k.tolowercase
		nm.Put(k, v)
	Next
	Return nm
End Sub

'convert a list of map records to lowerase
Sub MapKeysLowerCaseList(lst As List) As List
	Dim nl As List
	nl.Initialize
	For Each rec As Map In lst
		rec = MapKeysLowerCaseSingle(rec)
		nl.Add(rec)
	Next
	Return nl
End Sub


'get map values to a list
Sub GetMapValues(sourceMap As Map) As List
	Dim listOfValues As List
	listOfValues.Initialize
	Dim iCnt As Int
	Dim iTot As Int
	iTot = sourceMap.Size - 1
	For iCnt = 0 To iTot
		Dim value As Object = sourceMap.GetValueAt(iCnt)
		listOfValues.Add(value)
	Next
	Return listOfValues
End Sub

'get map keys to a list
Sub GetMapKeys(sourceMap As Map) As List
	Dim listOfValues As List
	listOfValues.Initialize
	Dim iCnt As Int
	Dim iTot As Int
	iTot = sourceMap.Size - 1
	For iCnt = 0 To iTot
		Dim value As Object = sourceMap.GetKeyAt(iCnt)
		listOfValues.Add(value)
	Next
	Return listOfValues
End Sub


'extract all numeric values from a string
Public Sub GetNumbers(value As String) As String
	value = CStr(value)
	Try
		value = value.Trim
		Dim sout As String = ""
		Dim mout As String = ""
		Dim slen As Int = value.Length
		Dim i As Int = 0
		For i = 0 To slen - 1
			mout = value.CharAt(i)
			If InStr("0123456789.-", mout) <> -1 Then
				sout = sout & mout
			End If
		Next
		Return sout
	Catch
		Return value
	End Try
End Sub

Sub SortMap(m As Map) As Map
	Try
		Dim nm As Map
		nm.Initialize
		Dim lst As List
		lst.Initialize
		For Each strkey As String In m.Keys
			lst.Add(strkey)
		Next
		'sort the list keys
		lst.Sort(True)
		For Each strkey As String In lst
			Dim strvalue As Object = m.Get(strkey)
			nm.Put(strkey,strvalue)
		Next
		Return nm
	Catch
		Return m
	End Try
End Sub

Sub GetShowState(k As String) As Boolean
	Dim showKey As String = $"${k}show"$
	Return GetState(showKey,False)
End Sub

Sub GetDisabledState(k As String) As Boolean
	Dim disKey As String = $"${k}disabled"$
	Return GetState(disKey,False)
End Sub

Sub SetShowState(k As String, v As Boolean)
	Dim showKey As String = $"${k}show"$
	SetStateSingle(showKey, v)
End Sub

Sub SetErrorState(k As String, v As Boolean)
	Dim showKey As String = $"${k}error"$
	SetStateSingle(showKey, v)
End Sub


Sub SetDisabledState(k As String, v As Boolean)
	Dim disKey As String = $"${k}disabled"$
	SetStateSingle(disKey, v)
End Sub

Sub MergeMaps(oldm As Map, newm As Map) As Map
	Dim om As Map = CreateMap()
	For Each k As String In oldm.Keys
		Dim v As Object = oldm.Get(k)
		om.Put(k, v)
	Next
	'
	For Each k As String In newm.Keys
		Dim v As Object = newm.Get(k)
		om.Put(k, v)
	Next
	Return om
End Sub

'change state of items to be false
Sub HideItems(items As List)
	For Each item As String In items
		SetStateSingle(item, False)
	Next
End Sub

'change state of items to be true
Sub ShowItems(items As List)
	For Each item As String In items
		SetStateSingle(item, True)
	Next
End Sub

Sub List2MapSimple(lst As List, bSort As Boolean) As Map
	If bSort Then lst.Sort(True)
	Dim nm As Map = CreateMap()
	For Each k As String In lst
		nm.Put(k, k)	
	Next
	Return nm
End Sub


'convert a list to key value pairs map records
Sub List2Options(lst As List, keyName As String, valueName As String) As Map
	Dim recs As List
	recs.Initialize
	For Each k As String In lst
		Dim nrec As Map = CreateMap()
		nrec.Put(keyName, k)
		nrec.Put(valueName, k)
		recs.Add(nrec)
	Next
	Return recs
End Sub

'convert a list to key value pairs map records
Sub List2Map(lst As List, keyName As String, valueName As String) As Map
	Return List2Options(lst, keyName, valueName)
End Sub

'convert map to a list of maps with key and values
Sub Map2Options(m As Map, keyName As String, valueName As String) As List
	Dim recs As List
	recs.Initialize
	For Each k As String In m.Keys
		Dim v As Object = m.Get(k)
		Dim nrec As Map = CreateMap()
		nrec.Put(keyName, k)
		nrec.Put(valueName, v)
		recs.Add(nrec)
	Next
	Return recs
End Sub

'create a replica of a map
Sub MapClone(oldMap As Map) As Map
	Dim nm As Map = CreateMap()
	For Each k As String In oldMap.keys
		Dim v As Object = oldMap.Get(k)
		nm.Put(k, v)
	Next
	Return nm
End Sub

'create a replica of a map by swap key values
Sub MapCloneSwap(oldMap As Map) As Map
	Dim nm As Map = CreateMap()
	For Each k As String In oldMap.keys
		Dim v As Object = oldMap.Get(k)
		nm.Put(v, k)
	Next
	Return nm
End Sub

'update the background image for the page during runtime
Sub SetBackgroundImage(elid As String, url As String)
	BANAno.GetElement(elid).SetStyle(BANAno.ToJson(CreateMap("background-image": $"url('${url}')"$, "background-size": "100% 100%")))
End Sub

'set a property in a json string
Sub JSONSetProperty(sjson As String, updates As Map) As String
	Dim m As Map = BANAno.FromJson(sjson)
	For Each k As String In updates.Keys
		Dim v As Object = updates.Get(k)
		m.Put(k, v)
	Next
	Dim sout As String = BANAno.ToJson(m)
	Return sout
End Sub

'create an OPTION element
Sub CreateOPTION(sid As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me,sid).SetTag("option")
	Return elx
End Sub


'create a 'select' element
Sub CreateSELECT(sid As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me,sid).SetTag("select")
	Return elx
End Sub


Sub EQOperators(sm As Map) As List
	Dim nl As List
	nl.initialize
	For Each k As String In sm.Keys
		nl.Add("=")
	Next
	Return nl
End Sub

Sub SetCloak(b As Boolean) As BANanoVue
	If b = False Then Return Me
	Template.SetAttr("v-cloak","true")
	Return Me
End Sub

'add a theme to use in the app
Sub AddTheme(themeName As String, ForeColor As String, ForeColorIntensity As String, BackColor As String, BackColorIntensity As String)
	themeName = themeName.ToLowerCase
	'
	Dim fc As String = $"${ForeColor}--text"$
	Dim fci As String = $"text--${ForeColorIntensity}"$
	Dim bc As String = $"${BackColor} ${BackColorIntensity}"$
	'
	fc = fc.trim
	fci = fci.Trim
	'
	If fc = "--text" Then fc = ""
	If fci = "text--" Then fci = ""
	'
	Dim classLine As String = $"${fc} ${fci} ${bc}"$
	classLine = classLine.Trim
	classLine = classLine.Replace("  "," ")
	classLine = classLine.Trim
	Themes.Put(themeName, classLine)
End Sub


'get a hex color from provided colors
Sub GetColorHex(sColor As String) As String
	sColor = sColor.tolowercase
	If ColorMap.ContainsKey(sColor) Then
		Dim xColor As String = ColorMap.Get(sColor)
		Return xColor
	End If
	Return ""
End Sub

'add break
Sub BR As String
	Return "<br>"
End Sub

'add hr
Sub HR As String
	Return "<hr>"
End Sub


#if javascript
function hexToRgb(hexCode) {
    var patt = /^#([\da-fA-F]{2})([\da-fA-F]{2})([\da-fA-F]{2})$/;
    var matches = patt.exec(hexCode);
    var rgb = "rgb(" + parseInt(matches[1], 16) + "," + parseInt(matches[2], 16) + "," + parseInt(matches[3], 16) + ")";
    return rgb;
}

function hexToRgba(hexCode, opacity) {
    var patt = /^#([\da-fA-F]{2})([\da-fA-F]{2})([\da-fA-F]{2})$/;
    var matches = patt.exec(hexCode);
    var rgb = "rgba(" + parseInt(matches[1], 16) + "," + parseInt(matches[2], 16) + "," + parseInt(matches[3], 16) + "," + opacity + ")";
    return rgb;
}
#End If

Sub MakePx(sValue As String) As String
	sValue = sValue.trim
	If sValue.EndsWith("%") Then
		Return sValue
	else If sValue.EndsWith("vm") Then
		Return sValue
	else If sValue.EndsWith("px") Then
		Return sValue
	else If sValue.EndsWith("cm") Then
		Return sValue
	else If sValue.EndsWith("mm") Then
		Return sValue
	else If sValue.EndsWith("in") Then
		Return sValue
	else If sValue.EndsWith("pt") Then
		Return sValue
	else If sValue.EndsWith("pc") Then
		Return sValue
	else If sValue.EndsWith("em") Then
		Return sValue
	else If sValue.EndsWith("ex") Then
		Return sValue
	else If sValue.EndsWith("ch") Then
		Return sValue
	else If sValue.EndsWith("rem") Then
		Return sValue
	else If sValue.EndsWith("vw") Then
		Return sValue
	else If sValue.EndsWith("vh") Then
		Return sValue
	else If sValue.EndsWith("vmin") Then
		Return sValue
	else If sValue.EndsWith("vmax") Then
		Return sValue
	else If sValue.EndsWith(";") Then
		Return sValue
	Else
		sValue = sValue.Replace("px","")
		sValue = $"${sValue}px"$
		If sValue = "px" Then sValue = ""
		Return sValue
	End If
End Sub

Sub CreateFORM(id As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me, id).SetTag("form")
	Return elx
End Sub

Sub CreateLABEL(id As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me, id).SetTag("label")
	Return elx
End Sub

Sub CreateINPUT(id As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me, id).SetTag("input")
	Return elx
End Sub

Sub CreateTEXTAREA(id As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me, id).SetTag("textarea")
	Return elx
End Sub

Sub CreateBUTTON1(id As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me, id).SetTag("button")
	Return elx
End Sub

'add a style to be applied after rendering
Sub SetStyle(className As String, prop As String, valx As String) As BANanoVue
	Dim m As Map
	If dynamicStyle.ContainsKey(className) Then
		m = dynamicStyle.Get(className)
		m.Put(prop, valx)
	Else
		m = CreateMap()
		m.Put(prop, valx)	
	End If
	dynamicStyle.Put(className, m)
	Return Me
End Sub

'save text to a file
Sub SaveText2File(content As String, fileName As String)
	Dim fc As List
	fc.Initialize
	fc.Add(content)
	Dim blob As BANanoObject
	blob.Initialize2("Blob",Array(fc, CreateMap("type": "text/plain;charset=utf-8")))
	BANAno.RunJavascriptMethod("saveAs",Array(blob,fileName))
End Sub

Sub SaveBinaryArray2File(iUint8Array As Object, dbName As String)
	Dim fc As List
	fc.Initialize
	fc.Add(iUint8Array)
	'
	Dim blob As BANanoObject
	blob.Initialize2("Blob",Array(fc, CreateMap("type": "application/octet-stream")))
	BANAno.RunJavascriptMethod("saveAs",Array(blob, dbName))
End Sub


Sub EnableItem(elID As String)
	elID = elID.tolowercase
	SetStateSingle($"${elID}disabled"$, False)
End Sub

Sub DisableItem(elID As String)
	elID = elID.tolowercase
	SetStateSingle($"${elID}disabled"$, True)
End Sub


Sub HideItem(elID As String)
	elID = elID.tolowercase
	SetStateSingle($"${elID}show"$, False)
End Sub

Sub ShowItem(elID As String)
	SetStateSingle($"${elID}show"$, True)
End Sub


Sub MvCount(strMV As String, Delimiter As String) As Int
	Dim spValues() As String = BANAno.Split(Delimiter,strMV)
	Return spValues.Length
End Sub

Sub SetOptionBO(optionName As String, optionObject As BANanoObject)
	Options.Put(optionName, optionObject)
End Sub

Sub AddComponent(comp As VMComponent) As BANanoVue
	Dim sid As String = comp.id
	If components.ContainsKey(sid) = True Then Return Me
	components.Put(sid, comp.Component)
	Return Me
End Sub

Sub AddComponentBO(compName As String, comp As BANanoObject) As BANanoVue
	If components.ContainsKey(compName) = True Then Return Me
	components.Put(compName, comp)
	Return Me
End Sub

Sub AddRoute(path As String, comp As VMComponent)
	If comp.name = "" Then
		Log("AddRoute: Please specify the name of the Route!")
	End If
	'
	Dim eachroute As Map = CreateMap()
	eachroute.Put("path", path)
	eachroute.Put("name", comp.name)
	eachroute.Put("component", comp.component)
	'
	routes.Add(eachroute)
End Sub

Sub CreateRouterLink(Text As String) As VueHTML
	Dim elx As VueHTML
	elx.Initialize("","router-link").SetText(Text)
	Return elx
End Sub

Sub CreateRouterView As VueHTML
	Dim elx As VueHTML
	elx.Initialize("","router-view")
	Return elx
End Sub

Sub AuditTrail(oldM As Map, newM As Map) As Map
	Dim df As Map = CreateMap()
	For Each k As String In oldM.Keys
		Dim v As Object = oldM.Get(k)
		If newM.ContainsKey(k) Then
			Dim nv As Object = newM.Get(k)
			If v <> nv Then
				df.Put(k, nv)
			End If
		End If
	Next
	For Each k As String In newM.Keys
		Dim v As Object = newM.Get(k)
		If oldM.ContainsKey(k) Then
			Dim ov As Object = oldM.Get(k)
			If v <> ov Then
				df.Put(k, v)
			End If
		Else
			df.Put(k, v)	
		End If
	Next
	Return df
End Sub

Public Sub TimeNow() As String
	Dim lNow As Long
	Dim dt As String
	lNow = DateTime.Now
	DateTime.DateFormat = "HH:mm"
	dt = DateTime.Date(lNow)
	Return dt
End Sub

Public Sub DateNow() As String
	Dim lNow As Long
	Dim dt As String
	lNow = DateTime.Now
	DateTime.DateFormat = "yyyy-MM-dd"
	dt = DateTime.Date(lNow)
	Return dt
End Sub

Public Sub DateTimeNow() As String
	Dim lNow As Long
	Dim dt As String
	lNow = DateTime.Now
	DateTime.DateFormat = "yyyy-MM-dd HH:mm"
	dt = DateTime.Date(lNow)
	Return dt
End Sub


Sub LongDateTimeToday() As String
	DateTime.DateFormat = "yyyy-MM-dd HH:mm"
	Dim dt As Long = DateTime.now
	DateTime.DateFormat = "dd/MM/yyyy, HH:mm"
	Return DateTime.Date(dt)
End Sub

Sub CopyMap(source As Map, keys As List) As Map
	Dim nm As Map = CreateMap()
	If keys.Get(0) = "*" Then
		For Each k As String In source.Keys
			Dim v As Object = source.Get(k)
			nm.Put(k, v)
		Next
	Else
		For Each k As String In keys
			Dim v As Object = source.Get(k)
			nm.Put(k, v)
		Next
	End If
	Return nm
End Sub

'return the first error in the list
Sub GetError As String
	Dim strError As String = Errors.GetValueAt(0)
	Return strError
End Sub

Sub Validate(rec As Map, required As Map) As Boolean
	Errors.Initialize
	Dim iv As Int = 0
	For Each k As String In required.Keys
		Dim error As String = required.GetDefault(k, "")
		If error = "" Then
			error = $"The ${k} should be specified!"$
		End If
		'get the message
		If rec.ContainsKey(k) Then
			Dim v As String = rec.GetDefault(k,"")
			v = CStr(v)
			v = v.trim
			If v = "" Then
				iv = iv + 1
				ShowError(k, error)
				Errors.Put(k, error)
			Else
				HideError(k)
			End If
		End If
	Next
	If iv = 0 Then
		Return True
	Else
		Return False
	End If
End Sub

Sub ShowError(elID As String, elError As String)
	elID = elID.tolowercase
	Dim pp As String = $"${elID}ErrorMessages"$
	Dim nl As List
	nl = NewList
	nl.Add(elError)
	SetData(pp, nl)
	Dim pp1 As String = $"${elID}Error"$
	SetData(pp1, True)
End Sub

Sub HideError(elID As String)
	elID = elID.tolowercase
	Dim pp As String = $"${elID}ErrorMessages"$
	Dim nl As List
	nl = NewList
	SetData(pp, nl)
	Dim pp1 As String = $"${elID}Error"$
	SetData(pp1, False)
End Sub

Sub GetFileParentPath(Path As String) As String
	Dim Path1 As String
	Dim L As Int
	If Path = "/" Then
		Return "/"
	End If
	L = Path.LastIndexOf("/")
	If L = Path.Length - 1 Then
		'Strip the last slash
		Path1 = Path.SubString2(0,L)
	Else
		Path1 = Path
	End If
	L = Path.LastIndexOf("/")
	If L = 0 Then
		L = 1
	End If
	Return Path1.SubString2(0,L)
End Sub

Sub GetFileExt(FullPath As String) As String
	Return FullPath.SubString(FullPath.LastIndexOf(".")+1)
End Sub

Sub SetPrefix(prefix As String, target As Map) As Map
	Dim nm As Map = CreateMap()
	For Each mk As String In target.Keys
		Dim mv As Object = target.Get(mk)
		Dim mk1 As String = prefix & "_" & mk
		nm.Put(mk1,mv)
	Next
	Return nm
End Sub

'convert object to string
Sub CStr(o As Object) As String
	If o = BANAno.UNDEFINED Then o = ""
	Return "" & o
End Sub

'make all keys lowercase
Sub FixRecords(recs As List, trimThese As List, numThese As List, boolThese As List, dateThese As List, dblThese As List)
	Dim rTot As Int = recs.Size - 1
	Dim rCnt As Int
	For rCnt = 0 To rTot
		Dim rec As Map = recs.Get(rCnt)
		'make all keys lowercase
		Dim nrec As Map = CreateMap()
		For Each k As String In rec.keys
			Dim v As Object = rec.Get(k)
			k = k.ToLowerCase
			nrec.Put(k, v)
		Next
		If dateThese <> Null Then MakeDate(nrec,dateThese)
		If trimThese <> Null Then MakeTrim(nrec,trimThese)
		If numThese <> Null Then MakeInteger(nrec, numThese)
		If dblThese <> Null Then MakeDouble(nrec, dblThese)
		If boolThese <> Null Then MakeBoolean(nrec, boolThese)
		recs.Set(rCnt, nrec)	
	Next
End Sub

Sub MakeInteger(m As Map, xkeys As List)
	For Each k As String In xkeys
		If m.ContainsKey(k) Then
			Dim v As String = m.GetDefault(k,"")
			v = CStr(v)
			v = v.trim
			If v = "" Then v = "0"
			v = BANAno.parseInt(v)
			m.Put(k, v)
		End If
	Next
End Sub

Sub MakeDouble(m As Map, xkeys As List)
	For Each k As String In xkeys
		If m.ContainsKey(k) Then
			Dim v As String = m.GetDefault(k,"")
			v = CStr(v)
			v = v.trim
			If v = "" Then v = "0"
			v = BANAno.parseFloat(v)
			m.Put(k, v)
		End If
	Next
End Sub

Sub MakeYesNo(m As Map, xkeys As List)
	For Each k As String In xkeys
		If m.ContainsKey(k) Then
			Dim v As String = m.GetDefault(k,"No")
			v = CStr(v)
			v = v.trim
			Select Case v
				Case "","0", "false", "False",False,0,"no","No"
					m.Put(k, "No")
				Case "1", "true", "True",True,1,"yes","Yes"
					m.Put(k, "Yes")
			End Select
		End If
	Next
End Sub



Sub MakeBoolean(m As Map, xkeys As List)
	For Each k As String In xkeys
		If m.ContainsKey(k) Then
			Dim v As String = m.GetDefault(k,"0")
			v = CStr(v)
			v = v.trim
			Select Case v
			Case "","0", "false", "False",False,0,"no","No"
				m.Put(k, False)
			Case "1", "true", "True",True,1,"yes","Yes"
				m.Put(k, True)
			End Select
		End If
	Next
End Sub

Sub GetRequiredState(k As String) As Boolean
	Dim disKey As String = $"${k}required"$
	Return GetState(disKey,False)
End Sub

Sub SetRequiredState(k As String, v As Boolean)
	Dim disKey As String = $"${k}required"$
	SetStateSingle(disKey, v)
End Sub


Sub MakeTrim(m As Map, xkeys As List)
	For Each k As String In xkeys
		If m.ContainsKey(k) Then
			Dim v As String = m.GetDefault(k,"")
			v = CStr(v)
			v = v.trim
			m.Put(k, v)
		End If
	Next
End Sub

Sub MakeLowerCase(m As Map) As Map
	Dim nm As Map = CreateMap()
	For Each k As String In m.Keys
		Dim v As Object = m.Get(k)
		k = k.tolowercase
		nm.Put(k, v)
	Next
	Return nm
End Sub

Sub MakeDate(m As Map, xkeys As List)
	For Each k As String In xkeys
		If m.ContainsKey(k) Then
			Dim v As String = m.GetDefault(k,"")
			v = CStr(v)
			v = v.trim
			v = MvField(v,1," ")
			m.Put(k, v)
		End If
	Next
End Sub


'get id from event
Sub GetIDFromEvent(e As BANanoEvent) As String
	Dim curEve As BANanoElement = BANAno.ToElement(e.OtherField("currentTarget"))
	Dim id As String = curEve.GetField("id").Result
	Return id
End Sub

'get id from event
Sub GetKeyFromEvent(e As BANanoEvent) As String
	Dim curEve As BANanoElement = BANAno.ToElement(e.OtherField("currentTarget"))
	Dim id As String = curEve.GetField("key").Result
	Return id
End Sub

Sub GetEventTargetProperty(e As BANanoEvent, prop As String) As String
	Dim sid As String = e.OtherField("target").GetField(prop).Result
	Return sid
End Sub

Sub GetFileListFromTarget(e As BANanoEvent) As List
	Dim files As List = e.OtherField("target").GetField("files").Result
	Return files
End Sub

Sub CallComputed(methodName As String) As Object
	methodName = methodName.tolowercase
	Return BOVue.GetField(methodName)
End Sub

Sub CallMethod(methodName As String)
	methodName = methodName.tolowercase
	BOVue.RunMethod(methodName, Null)
End Sub

Sub RunMethod(methodName As String, params As Object) As BANanoObject
	Return BOVue.RunMethod(methodName, params)
End Sub

Sub SetStateTrue(k As String) As BANanoVue
	SetStateSingle(k,True)
	Return Me
End Sub

Sub SetStateFalse(k As String) As BANanoVue
	SetStateSingle(k,False)
	Return Me
End Sub

Sub SetStateIncrement(k As String) As BANanoVue
	Dim oldV As String = GetState(k, "0")
	oldV = BANAno.parseInt(oldV) + 1
	SetStateSingle(k, oldV)
	Return Me
End Sub

Sub SetStateDecrement(k As String) As BANanoVue
	Dim oldV As String = GetState(k, "0")
	oldV = BANAno.parseInt(oldV) - 1
	SetStateSingle(k, oldV)
	Return Me
End Sub

Sub SetStateList(k As String, l As List) As BANanoVue
	k = k.tolowercase
	data.Put(k, l)
	Return Me
End Sub

'a single state change
Sub SetStateSingle(k As String, v As Object) As BANanoVue
	k = k.tolowercase
	data.Put(k, v)
	Return Me 
End Sub

Sub SetBoolean(k As String, b As Boolean) As BANanoVue
	k = k.tolowercase
	data.Put(k, b)
	Return Me
End Sub

Sub SetList(k As String, l As Boolean) As BANanoVue
	k = k.tolowercase
	data.Put(k, l)
	Return Me
End Sub

Sub NotState(stateName As String) As Boolean
	Dim bcurrent As Boolean = GetState(stateName,False)
	If bcurrent = Null Then bcurrent = True
	bcurrent = Not(bcurrent)
	Return bcurrent
End Sub

Sub ToggleState(stateName As String) As BANanoVue
	Dim bcurrent As Boolean = GetState(stateName,False)
	If bcurrent = Null Then bcurrent = True
	bcurrent = Not(bcurrent)
	SetStateSingle(stateName, bcurrent)
	Return Me
End Sub

Sub ToggleNamedState(stateName As String, state1 As String, state2 As String) As BANanoVue
	Dim bcurrent As String = GetState(stateName,"")
	If bcurrent.EqualsIgnoreCase(state1) Then
		Dim opt As Map = CreateMap()
		opt.Put(stateName, state2)
		SetState(opt)
	Else
		Dim opt As Map = CreateMap()
		opt.Put(stateName, state1)
		SetState(opt)
	End If
	Return Me	
End Sub

Sub StrParse(delim As String, inputString As String) As List
	Dim values() As String = BANAno.Split(delim,inputString)
	Dim nl As List
	nl.Initialize
	nl.AddAll(values)
	Return nl
End Sub


'set booleans from checked and unchecked values
Sub SetBooleans(rec As Map, xFields As List, checkedValue As String, UnCheckedValue As String) As Map
	Try
		For Each sfield As String In xFields
			Dim svalue As String = rec.Get(sfield)
			If svalue.EqualsIgnoreCase(checkedValue) Then rec.Put(sfield, True)
			If svalue.EqualsIgnoreCase(UnCheckedValue) Then rec.Put(sfield, False)
		Next
		Return rec
	Catch
		Return rec
	End Try
End Sub

Sub SetUncheckedValue(rec As Map, xfields As List, checkedValue As String, UncheckedValue As String) As Map
	Try
		For Each sfield As String In xfields
			Dim svalue As String = rec.Get(sfield)
			If svalue.EqualsIgnoreCase(checkedValue) = False Then
				rec.Put(sfield, UncheckedValue)
			End If
		Next
		Return rec
	Catch
		Return rec
	End Try
End Sub

Sub CreateList(Delimiter As String, Values As String) As List
	Dim newLst As List
	newLst.Initialize
	If Values.length > 0 Then
		Dim spV As List = StrParse(Delimiter,Values)
		newLst.AddAll(spV)
	End If
	Return newLst
End Sub

'mvfield sub
Sub MvField(sValue As String, iPosition As Int, Delimiter As String) As String
	If sValue.Length = 0 Then Return ""
	Dim xPos As Int = sValue.IndexOf(Delimiter)
	If xPos = -1 Then Return sValue
	Dim mValues As List = StrParse(Delimiter,sValue)
	Dim tValues As Int
	tValues = mValues.size -1
	Select Case iPosition
		Case -1
			Return mValues.get(tValues)
		Case -2
			Return mValues.get(tValues - 1)
		Case -3
			Dim sb As StringBuilder
			sb.Initialize
			Dim startcnt As Int
			sb.Append(mValues.Get(1))
			For startcnt = 2 To tValues
				sb.Append(Delimiter)
				sb.Append(mValues.get(startcnt))
			Next
			Return sb.tostring
		Case Else
			iPosition = iPosition - 1
			If iPosition <= -1 Then
				Return mValues.get(tValues)
			End If
			If iPosition > tValues Then
				Return ""
			End If
			Return mValues.get(iPosition)
	End Select
End Sub


'Returns a random list value from a LIST 
Sub RandListValue(ListX As List) As Object
	ShuffleList(ListX)
	Return ListX.Get(Rnd(0, ListX.Size -1))
End Sub

'remove from list
Sub RamoveFromList(listX As List, item As String)
	Dim li As Int = listX.IndexOf(item)
	If li >= 0 Then listX.RemoveAt(li)
End Sub

Sub ShuffleList(pl As List) As List
	For i = pl.Size - 1 To 0 Step -1
		Dim j As Int
		Dim k As Object
		j = Rnd(0, i + 1)
		k = pl.Get(j)
		pl.Set(j,pl.Get(i))
		pl.Set(i,k)
	Next
	Return pl
End Sub


'check if we have state
Sub StateExists(stateName As String) As Boolean
	stateName = stateName.tolowercase
	Return data.ContainsKey(stateName)
End Sub

''set the font family
Sub SetFontFamily(ff As Object)
	body.SetStyle(BANAno.ToJson(CreateMap("font-family": ff)))
End Sub

'set the background image style
Sub SetCoverImage(imgURL As String)
	Dim opt As Map = CreateMap()
	If imgURL = "none" Then
		opt.Put("background-image", "none")
	Else
		'opt.Put("background-image", $"url('${imgURL}')"$)
		'opt.Put("background-position", "center center")
		'opt.Put("background-repeat", "no-repeat")
		'opt.Put("background-attachment", "fixed")
		'opt.Put("background-size", "cover")
		
		opt.Put("background", $"url('${imgURL}')"$)
		opt.Put("position", "absolute")
		opt.Put("height", "100%")
		opt.Put("width", "100%")
		opt.Put("top", "0")
		opt.Put("bottom", "0")
		opt.Put("right", "0")
		opt.Put("left", "0")
		opt.Put("z-index", "0")
	End If
	Dim sjson As String = BANAno.ToJson(opt)
	body.SetStyle(sjson)
End Sub

'inject the template
Sub SetTemplate(tmp As String)
	Template.SetText(tmp)
End Sub

'use a component module
Sub Use(bo As BANanoObject)
	BOVue.RunMethod("use", bo)
End Sub

'use a component module
Sub Use1(bo As BANanoObject, opt As Map)
	BOVue.RunMethod("use", Array(bo, opt))
End Sub
'
'Sub SetFocus(sid As String) As BANanoVue
'	If sid <> "" Then
'		sid = sid.tolowercase
'		Dim input As BANanoObject = refs.Get(sid)
'		Dim el As String = "$el"
'		input.GetField(el).RunMethod("focus", Null)
'	End If
'	Return Me
'End Sub

Sub SetFrameWork(optName As String, boFrameWork As BANanoObject)
	Options.Put(optName, boFrameWork)
End Sub

'render the ux
Sub UX()
	Dim tmp As String = Template.tostring
	GetTemplate = tmp
	If routes.Size > 0 Then
		Dim ropt As Map = CreateMap()
		ropt.Put("mode", "history") 
		ropt.Put("routes", routes)
		Dim router As BANanoObject
		router.Initialize2("VueRouter", Array(ropt))
		Options.Put("router", router)
	End If
	Options.Put("el", "#app")
	If data.Size > 0 Then Options.put("data", data)
	If methods.Size > 0 Then Options.Put("methods", methods)
	If computed.Size > 0 Then Options.Put("computed", computed)
	If watches.Size > 0 Then Options.Put("watch", watches)
	If components.Size > 0 Then Options.Put("components", components)
	Options.Put("template", tmp)
	BOVue.Initialize2("Vue", Options)
	'get the state
	Dim dKey As String = "$data"
	data = BOVue.GetField(dKey).Result
	'get the refs
	Dim rKey As String = "$refs"
	refs = BOVue.GetField(rKey)
	Dim elKey As String = "$el"
	el = BOVue.GetField(elKey)
	'enable data to be available globally
	'BOVue.GetField("prototype").SetField("$store", store)
End Sub

Sub ForceUpdate
	Dim fu As String = "$forceUpdate"
	BOVue.RunMethod(fu, Null)
	'get the state
	Dim dKey As String = "$data"
	data = BOVue.GetField(dKey).Result
	'get the refs
	Dim rKey As String = "$refs"
	refs = BOVue.GetField(rKey)
End Sub

'set mounted
Sub SetMounted(module As Object, methodName As String) As BANanoVue
	methodName = methodName.ToLowerCase
	If SubExists(module, methodName) = False Then Return Me
	Dim mounted As BANanoObject = BANAno.CallBack(module, methodName, Null)
	Options.Put("mounted", mounted)
	SetMethod(module, methodName)
	Return Me
End Sub


'set destroyed
Sub SetDestroyed(module As Object, methodName As String) As BANanoVue
	methodName = methodName.ToLowerCase
	If SubExists(module, methodName) = False Then Return Me
	Dim destroyed As BANanoObject = BANAno.CallBack(module, methodName, Null)
	Options.Put("destroyed", destroyed)
	SetMethod(module, methodName)
	Return Me
End Sub


'set activated
Sub SetActivated(module As Object, methodName As String) As BANanoVue
	methodName = methodName.ToLowerCase
	If SubExists(module, methodName) = False Then Return Me
	Dim activated As BANanoObject = BANAno.CallBack(module, methodName, Null)
	Options.Put("activated", activated)
	SetMethod(module, methodName)
	Return Me
End Sub


'set deactivated
Sub SetDeActivated(module As Object, methodName As String) As BANanoVue
	methodName = methodName.ToLowerCase
	If SubExists(module, methodName) = False Then Return Me
	Dim deactivated As BANanoObject = BANAno.CallBack(module, methodName, Null)
	Options.Put("deactivated", deactivated)
	SetMethod(module, methodName)
	Return Me
End Sub


'set updated
Sub SetUpdated(module As Object, methodName As String) As BANanoVue
	methodName = methodName.ToLowerCase
	If SubExists(module, methodName) = False Then Return Me
	Dim updated As BANanoObject = BANAno.CallBack(module, methodName, Null)
	Options.Put("updated", updated)
	SetMethod(module, methodName)
	Return Me
End Sub

'set beforemount
Sub SetBeforeMount(module As Object, methodName As String) As BANanoVue
	methodName = methodName.ToLowerCase
	If SubExists(module, methodName) = False Then Return Me
	Dim beforeMount As BANanoObject = BANAno.CallBack(module, methodName, Null)
	Options.Put("beforeMount", beforeMount)
	SetMethod(module, methodName)
	Return Me
End Sub

'set beforeupdate
Sub SetBeforeUpdate(module As Object, methodName As String) As BANanoVue
	methodName = methodName.ToLowerCase
	If SubExists(module, methodName) = False Then Return Me
	Dim beforeUpdate As Boolean = BANAno.CallBack(module, methodName, Null)
	Options.Put("beforeUpdate", beforeUpdate)
	SetMethod(module, methodName)
	Return Me
End Sub

'set before destroy
Sub SetBeforeDestroy(module As Object, methodName As String) As BANanoVue
	methodName = methodName.ToLowerCase
	If SubExists(module, methodName) = False Then Return Me
	Dim beforeDestroy As Boolean = BANAno.CallBack(module, methodName, Null)
	Options.Put("beforeDestroy", beforeDestroy)
	SetMethod(module, methodName)
	Return Me
End Sub


'set before created
Sub SetBeforeCreate(module As Object, methodName As String) As BANanoVue
	methodName = methodName.ToLowerCase
	If SubExists(module, methodName) = False Then Return Me
	Dim beforeCreate As BANanoObject = BANAno.CallBack(module, methodName, Null)
	Options.Put("beforeCreate", beforeCreate)
	SetMethod(module, methodName)
	Return Me
End Sub


'set created
Sub SetCreated(module As Object, methodName As String) As BANanoVue
	methodName = methodName.ToLowerCase
	If SubExists(module, methodName) = False Then Return Me
	Dim created As BANanoObject = BANAno.CallBack(module, methodName, Null)
	Options.Put("created", created)
	SetMethod(module, methodName)
	Return Me
End Sub

'set direct method
Sub SetMethod(module As Object, methodName As String) As BANanoVue
	methodName = methodName.ToLowerCase
	If SubExists(module, methodName) Then
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANAno.CallBack(module, methodName, Array(e))
		methods.Put(methodName, cb)
	Else
		Log($"SetMethod.${methodName} could not be found!"$)
	End If
	Return Me
End Sub

Sub SetCallBack(methodName As String, cb As BANanoObject)
	methodName = methodName.ToLowerCase
	methods.Put(methodName, cb)
End Sub

Sub RemoveMethod(methodName As String) As BANanoVue
	methodName = methodName.ToLowerCase
	If methods.ContainsKey(methodName) Then 
		methods.Remove(methodName)
	End If
	Return Me
End Sub

'set computed
Sub SetComputed1(k As String, module As Object, methodName As String) As BANanoVue
	methodName = methodName.ToLowerCase
	If SubExists(module, methodName) Then
		k = k.tolowercase
		If data.ContainsKey(k) Then
			SetStateSingle(k, Null)
		End If
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANAno.CallBack(module, methodName, Array(e))
		computed.Put(k, cb)
	End If
	Return Me
End Sub

'set computed
Sub SetComputed(module As Object, methodName As String) As BANanoVue
	methodName = methodName.ToLowerCase
	If SubExists(module, methodName) Then
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANAno.CallBack(module, methodName, Array(e))
		computed.Put(methodName, cb)
	End If
	Return Me
End Sub

Sub SetNextTick(module As Object, methodName As String) As BANanoVue
	methodName = methodName.ToLowerCase
	Dim cb As BANanoObject = BANAno.CallBack(module, methodName, Null)
	BOVue.RunMethod("nextTick", cb)
	Return Me
End Sub

'set watches 
Sub SetWatch(k As String, bImmediate As Boolean, bDeep As Boolean, module As Object, methodName As String) As BANanoVue
	methodName = methodName.tolowercase
	If SubExists(module, methodName) Then
		k = k.tolowercase
		If data.ContainsKey(k) Then
			SetStateSingle(k, Null)
		End If
		Dim newVal As Object
		Dim cb As BANanoObject = BANAno.CallBack(module, methodName, Array(newVal))
		Dim deepit As Map = CreateMap()
		deepit.Put("handler", methodName)
		deepit.Put("deep", bDeep)
		deepit.Put("immediate", bImmediate)
		watches.Put(k, deepit)
		methods.Put(methodName, cb)
	End If
	Return Me
End Sub

'set state object
Sub SetStateMap(mapKey As String, mapValues As Map) As BANanoVue
	SetStateSingle(mapKey, mapValues)
	Return Me
End Sub

Sub SetStateListValues(mapValues As List) As BANanoVue
	For Each lstValue As String In mapValues
		SetStateSingle(lstValue,"")
	Next 
	Return Me
End Sub

'set the state
Sub SetState(m As Map) As BANanoVue
	Try
	For Each k As String In m.Keys
		Dim v As Object = m.Get(k)
		k = k.tolowercase
		data.Put(k, v)
	Next
	Catch
		Log(LastException)
	End Try	
	Return Me	
End Sub

'return if state exists
Sub HasState(k As String) As Boolean
	k = k.tolowercase
	Return data.ContainsKey(k)
End Sub

Sub GetStates(lst As List) As Map
	Dim sm As Map = CreateMap()
	For Each lstrec As String In lst
		lstrec = lstrec.tolowercase
		Dim state As Object = GetState(lstrec, Null)
		sm.Put(lstrec, state)
	Next
	Return sm
End Sub
'
''get ref
'Sub GetRef(k As String) As BANanoObject
'	k = k.tolowercase
'	If refs.ContainsKey(k) Then
'		Dim out As BANanoObject = refs.Get(k)
'		Return out
'	Else
'		Log("GetRef: First set the ref for " & k)
'		Return Null
'	End If
'End Sub


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

Sub CreateTag(id As String, tag As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me,id).SetTag(tag)
	Return elx
End Sub

Sub CreateDiv(id As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me,id).SetTag("div")
	Return elx
End Sub

Sub CreateSPAN(id As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me,id).SetTag("span")
	Return elx
End Sub

Sub CreateUL(id As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me,id).SetTag("ul")
	Return elx
End Sub

Sub CreateLI(id As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me,id).SetTag("li")
	Return elx
End Sub


Sub CreateOL(id As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me,id).SetTag("ol")
	Return elx
End Sub


Sub CreateP(id As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me, id).SetTag("p")
	Return elx
End Sub

Sub CreateKeepAlive(sid As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me,sid).SetTag("keep-alive")
	Return elx
End Sub

'create an element with a 'component' tag
Sub CreateComponent(id As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me, id).SetTag("component")
	Return elx
End Sub

Sub CreateIMG(img As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me, img).SetTag("img")
	Return elx
End Sub

Sub CreateH1(id As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me, id).SetTag("h1")
	Return elx
End Sub

Sub CreateH2(id As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me, id).SetTag("h2")
	Return elx
End Sub

Sub CreateH3(id As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me, id).SetTag("h3")
	Return elx
End Sub

Sub CreateH4(id As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me, id).SetTag("h4")
	Return elx
End Sub

Sub CreateH5(id As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me, id).SetTag("h5")
	Return elx
End Sub

Sub CreateH6(id As String) As VMElement
	Dim elx As VMElement
	elx.Initialize(Me, id).SetTag("h6")
	Return elx
End Sub


public Sub AfterTodayRG(dVariance As Long) As String
	If dVariance <= 0 Then
		Return "./assets/green.png"
	else if dVariance > 0 Then
		Return "./assets/red.png"
	Else
		Return "./assets/gray.png"
	End If
End Sub


Public Sub ProgressRAG(dVariance As Double) As String
	If dVariance < 0 Then
		Return "./assets/red.png"
	else if dVariance > 0 Then
		Return "./assets/green.png"
	else if dVariance = 0 Then
		Return "./assets/orange.png"
	Else
		Return "./assets/gray.png"
	End If
End Sub


Public Sub ExpectedRAG(dValue As Double) As String
	If dValue = 0 Then
		Return "./assets/orange.png"
	else if dValue > 0 Then
		Return "./assets/red.png"
	else if dValue < 0 Then
		Return "./assets/green.png"
	Else
		Return "./assets/red.png"
	End If
End Sub

Public Sub ExpenditureRAG(dVariance As Double) As String
	If dVariance > 0 Then
		Return "./assets/green.png"
	else if dVariance < 0 Then
		Return "./assets/red.png"
	else if dVariance = 0 Then
		Return "./assets/orange.png"
	Else
		Return "./assets/gray.png"
	End If
End Sub

Public Sub PriorityRAG(dValue As Int) As String
	Select Case dValue
		Case 0
			Return "./assets/green.png"
		Case 1
			Return "./assets/orange.png"
		Case 2
			Return "./assets/red.png"
		Case Else
			Return "./assets/gray.png"
	End Select
End Sub

Public Sub RAG(dValue As Int) As String
	Select Case dValue
		Case 0
			Return "./assets/red.png"
		Case 1
			Return "./assets/orange.png"
		Case 2
			Return "./assets/green.png"
		Case Else
			Return "./assets/gray.png"
	End Select
End Sub

Public Sub GAR(dValue As Int) As String
	Select Case dValue
		Case 0
			Return "./assets/green.png"
		Case 1
			Return "./assets/orange.png"
		Case 2
			Return "./assets/red.png"
		Case Else
			Return "./assets/gray.png"
	End Select
End Sub

Public Sub StatusRAG(dValue As Int) As String
	Select Case dValue
		Case 0
			Return "./assets/red.png"
		Case 1
			Return "./assets/orange.png"
		Case 2
			Return "./assets/green.png"
		Case Else
			Return "./assets/gray.png"
	End Select
End Sub

Public Sub FaceRAG(dValue As Int) As String
	Select Case dValue
		Case 0
			Return "./assets/sadface.png"
		Case 1
			Return "./assets/neutralface.png"
		Case 2
			Return "./assets/happyface.png"
		Case Else
			Return "./assets/sadface.png"
	End Select
End Sub

Public Sub FaceRG(dValue As Int) As String
	Select Case dValue
		Case 0
			Return "./assets/sadface.png"
		Case 1
			Return "./assets/happyface.png"
		Case Else
			Return "./assets/sadface.png"
	End Select
End Sub

Public Sub FaceRG1(dValue As Int) As String
	Select Case dValue
		Case 1
			Return "./assets/sadface.png"
		Case 0
			Return "./assets/happyface.png"
		Case Else
			Return "./assets/sadface.png"
	End Select
End Sub

Public Sub FaceDone(dValue As Int) As String
	Select Case dValue
		Case 100
			Return "./assets/happyface.png"
		Case Else
			Return "./assets/sadface.png"
	End Select
End Sub

Sub ProgressStatus(dValue As Int) As Int
	Select Case dValue
		Case 100
			Return 1
		Case Else
			Return 0
	End Select
End Sub

Sub StatusRG(dValue As Int) As String
	Select Case dValue
		Case 0
			Return "./assets/red.png"
		Case 1
			Return "./assets/green.png"
		Case Else
			Return "./assets/red.png"
	End Select
End Sub

Sub EscapeField(f As String) As String
	Return $"[${f}]"$
End Sub

'join list to multi value string
Sub JoinFields(delimiter As String, lst As List) As String
	If lst.Size = 0 Then Return ""
	Dim i As Int
	Dim sb As StringBuilder
	Dim fld As String
	sb.Initialize
	fld = lst.Get(0)
	fld = EscapeField(fld)
	sb.Append(fld)
	For i = 1 To lst.size - 1
		Dim fld As String = lst.Get(i)
		fld = EscapeField(fld)
		sb.Append(delimiter).Append(fld)
	Next
	Return sb.ToString
End Sub

'join list to multi value string with a quote
Sub JoinFields1(delimiter As String, sQuote As String, lst As List) As String
	If lst.Size = 0 Then Return ""
	Dim i As Int
	Dim sb As StringBuilder
	Dim fld As String
	sb.Initialize
	fld = lst.Get(0)
	Dim xfld As String = $"${fld}"$
	xfld = sQuote & xfld & sQuote
	sb.Append(xfld)
	For i = 1 To lst.size - 1
		Dim fld As String = lst.Get(i)
		Dim xfld As String = $"${fld}"$
		xfld = sQuote & xfld & sQuote
		sb.Append(delimiter).Append(xfld)
	Next
	Return sb.ToString
End Sub

Sub SetRequired(elID As String, b As Boolean)
	elID = elID.tolowercase
	SetStateSingle($"${elID}required"$, b)
End Sub

Sub Enable(elID As String)
	elID = elID.tolowercase
	SetStateSingle($"${elID}disabled"$, False)
End Sub

Sub Disable(elID As String)
	elID = elID.tolowercase
	SetStateSingle($"${elID}disabled"$, True)
End Sub

Sub SetEnabled(elID As String, b As Boolean)
	elID = elID.tolowercase
	SetStateSingle($"${elID}disabled"$, b)
End Sub

Sub Hide(elID As String)
	elID = elID.tolowercase
	SetStateSingle($"${elID}show"$, False)
End Sub

Sub Show(elID As String)
	SetStateSingle($"${elID}show"$, True)
End Sub


Sub GetOptionsFromKV(delim As String, k As String, v As String) As Map
	k = CStr(k)
	v = CStr(v)
	Dim no As Map = CreateMap()
	Dim rkeys() As String = BANAno.Split(delim, k)
	Dim rvalues() As String = BANAno.Split(delim, v)
	'
	Dim rTot As Int = rkeys.Length - 1
	Dim vTot As Int = rvalues.Length - 1
	'
	If rTot <> vTot Then Return no
	'
	Dim rCnt As Int
	For rCnt = 0 To rTot
		Dim k1 As String = rkeys(rCnt)
		Dim v1 As String = rvalues(rCnt)
		no.put(k1, v1)
	Next
	Return no
End Sub


'unflatten as list of map objects using id, parentid, data attributes
Sub Unflatten(tdata As List, childname As String) As List
	'id, parentid, data
	Dim tree As List
	Dim mappedArr As Map
	'
	tree.Initialize
	mappedArr.Initialize
	'
	'create a temp map to hold everything with 'children' as 'data'
	For Each arrElem As Map In tdata
		Dim dID As String = arrElem.Get("id")
		'
		Dim cdata As List
		cdata.Initialize
		arrElem.Put(childname, cdata)
		'
		mappedArr.Put(dID, arrElem)
	Next
	'
	For Each dID As String In mappedArr.Keys
		Dim mappedElem As Map = mappedArr.Get(dID)
		Dim parentid As String = mappedElem.Get("parentid")
		' If the element is at the root level, add it to first level elements list.
		If parentid = "" Or parentid = "0" Then
			tree.Add(mappedElem)
		Else
			'If the element is not at the root level, add it to its parent list of children.
			Dim parentElem As Map = mappedArr.Get(parentid)
			Dim children As List = parentElem.Get(childname)
			children.Add(mappedElem)
			parentElem.Put(childname, children)
			mappedArr.Put(parentid, parentElem)
		End If
	Next
	'
	For Each mk As String In mappedArr.Keys
		Dim mi As Map = mappedArr.Get(mk)
		Dim childs As List = mi.Get(childname)
		If childs.Size = 0 Then mi.Remove(childname)
	Next
	Return tree
End Sub

public Sub readAsText(fr As String) As BANanoPromise
	Dim promise As BANanoPromise 'ignore
		
	' calling a single upload
	promise.CallSub(Me, "ReadFile", Array(fr, "readAsText"))
	Return promise
End Sub

Sub readAsBinaryString(fr As String) As BANanoPromise
	Dim promise As BANanoPromise 'ignore
		
	' calling a single upload
	promise.CallSub(Me, "ReadFile", Array(fr, "readAsBinaryString"))
	Return promise
End Sub

Sub readAsDataURL(fr As String) As BANanoPromise
	Dim promise As BANanoPromise 'ignore
		
	' calling a single upload
	promise.CallSub(Me, "ReadFile", Array(fr, "readAsDataURL"))
	Return promise
End Sub

Sub readAsArrayBuffer(fr As String) As BANanoPromise
	Dim promise As BANanoPromise 'ignore
		
	' calling a single upload
	promise.CallSub(Me, "ReadFile", Array(fr, "readAsArrayBuffer"))
	Return promise
End Sub

private Sub ReadFile(FileToRead As Object, MethodName As String)
	' make a filereader
	Dim FileReader As BANanoObject
	FileReader.Initialize2("FileReader", Null)
	' attach the file (to get the name later)
	FileReader.SetField("file", FileToRead)
	
	' make a callback for the onload event
	' an onload of a FileReader requires a 'event' param
	Dim event As Map
	FileReader.SetField("onload", BANAno.CallBack(Me, "OnLoad", Array(event)))
	FileReader.SetField("onerror", BANAno.CallBack(Me, "OnError", Array(event)))
	' start reading the DataURL
	FileReader.RunMethod(MethodName, FileToRead)
End Sub

private Sub OnLoad(event As Map) As String 'ignore
	' getting our file again (set in UploadFileAndGetDataURL)
	Dim FileReader As BANanoObject = event.Get("target")
	Dim UploadedFile As BANanoObject = FileReader.GetField("file")
	' return to the then of the UploadFileAndGetDataURL
	BANAno.ReturnThen(CreateMap("name": UploadedFile.GetField("name"), "result": FileReader.Getfield("result")))
End Sub

private Sub OnError(event As Map) As String 'ignore
	Dim FileReader As BANanoObject = event.Get("target")
	Dim UploadedFile As BANanoObject = FileReader.GetField("file")
	Dim Abort As Boolean = False
	' uncomment this if you want to abort the whole operatio
	' Abort = true
	' FileReader.RunMethod("abort", Null)
	
	BANAno.ReturnElse(CreateMap("name": UploadedFile.GetField("name"), "result": FileReader.GetField("error"), "abort": Abort))
End Sub

'
'join list to multi value string with a quote
Sub JoinItems(delimiter As String, sQuote As String, lst As List) As String
	If lst.Size = 0 Then Return ""
	Dim i As Int
	Dim sb As StringBuilder
	Dim fld As String
	sb.Initialize
	fld = lst.Get(0)
	Dim xfld As String = $"${fld}"$
	xfld = sQuote & xfld & sQuote
	sb.Append(xfld)
	For i = 1 To lst.size - 1
		Dim fld As String = lst.Get(i)
		Dim xfld As String = $"${fld}"$
		xfld = sQuote & xfld & sQuote
		sb.Append(delimiter).Append(xfld)
	Next
	Return sb.ToString
End Sub


'focus on a ref
Sub SetFocus(refID As String)
	refID = refID.tolowercase
	refs.GetField(refID).RunMethod("focus", Null)
End Sub


'nullify the file select
Sub NullifyFileSelect(refID As String)
	RefNull(refID)
End Sub

Sub RefNull(refID As String)
	refID = refID.tolowercase
	refs.GetField(refID).SetField("value", Null)
End Sub


'click a reference
Sub RefClick(refID As String)
	refID = refID.tolowercase
	refs.GetField(refID).RunMethod("click", Null)
End Sub

Sub ShowFileSelect(fsName As String)
	RefClick(fsName)
End Sub


Sub RefreshKey(keyName As String) As BANanoVue
	keyName = keyName.ToLowerCase
	SetData(keyName, DateTime.now)
	Return Me
End Sub


Sub Increment(elID As String, valueOf As Int) As BANanoVue
	elID = elID.tolowercase
	Dim oldv As Int = GetState(elID,0)
	oldv = BANAno.parseInt(oldv) + valueOf
	SetStateSingle(elID, oldv)
	Return Me
End Sub

Sub Decrement(elID As String, valueOf As Int) As BANanoVue
	elID = elID.tolowercase
	Dim oldv As Int = GetState(elID,0)
	oldv = BANAno.parseInt(oldv) - valueOf
	SetStateSingle(elID, oldv)
	Return Me
End Sub

