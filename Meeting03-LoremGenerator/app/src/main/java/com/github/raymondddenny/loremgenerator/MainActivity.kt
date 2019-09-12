package com.github.raymondddenny.loremgenerator

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.databinding.DataBindingUtil
import com.github.raymondddenny.loremgenerator.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    // assign the ipsum to variable first
    val PirateIpsum: MyData = MyData("Pirate Ipsum","Lugger haul wind Pirate Round strike colors rigging grapple crimp gangplank quarter run a rig. Black spot run a rig Yellow Jack Jack Ketch piracy Spanish Main man-of-war boom deadlights chase. Bilge rat hogshead Pieces of Eight American Main red ensign spanker flogging list hardtack aye.\n" +
            "\n" +
            "Nelsons folly barkadeer prow lee keel bowsprit Davy Jones' Locker trysail Jack Ketch chase. Sutler interloper sheet boatswain lanyard plunder swab cog maroon lad. Booty Plate Fleet hornswaggle salmagundi scuppers swab aft Pieces of Eight clap of thunder Letter of Marque.\n" +
            "\n" +
            "Reef hands bilged on her anchor grog blossom weigh anchor topgallant deadlights gangway fire ship measured fer yer chains. Matey rope's end ballast fathom tack splice the main brace flogging reef sails shrouds Arr. Lateen sail long boat reef broadside belay list keel spike man-of-war gabion.")
    val CupcakeIpsum: MyData = MyData("Cupcake Ipsum","Muffin lollipop I love dragée. I love gummi bears jujubes macaroon. Chocolate bar sugar plum muffin apple pie. Sesame snaps candy canes dessert liquorice lollipop tart. Cotton candy macaroon liquorice I love muffin cake jujubes lemon drops lemon drops. Lemon drops tart cupcake soufflé caramels candy canes sweet bonbon sesame snaps. Pudding soufflé dessert tart chupa chups topping toffee sesame snaps danish. I love jelly-o chocolate cake ice cream chocolate cake powder dessert. Oat cake pie I love pie lollipop pudding carrot cake jelly dessert.\n" +
            "\n" +
            "I love toffee tart. Gingerbread tiramisu topping biscuit soufflé wafer candy halvah sweet. Ice cream donut croissant sweet roll biscuit ice cream. Ice cream cotton candy toffee cake pie candy muffin cake. Marzipan jelly-o sweet roll jelly tootsie roll I love. Ice cream chocolate cake jelly powder toffee. Sweet candy biscuit bonbon candy. Bear claw toffee chupa chups lemon drops pastry. Soufflé toffee topping tiramisu lemon drops. I love chocolate cake powder macaroon sweet halvah.\n" +
            "\n" +
            "I love I love marshmallow. Bear claw jelly chocolate bar I love gingerbread liquorice gingerbread muffin. Candy canes chocolate cake gummies I love carrot cake. Marshmallow jelly gingerbread lollipop I love donut donut caramels. Cake marzipan I love soufflé I love cheesecake apple pie. Cake marzipan I love I love powder lollipop I love lollipop. Cheesecake powder caramels muffin. Jelly beans icing danish wafer wafer powder gingerbread cake gummies. Bonbon macaroon chocolate cake topping cake liquorice. Halvah croissant lemon drops caramels tiramisu.\n" +
            "\n" +
            "Candy cupcake jujubes chocolate bar cheesecake. Tiramisu oat cake sesame snaps. Toffee jujubes donut. Pie bonbon danish soufflé tootsie roll I love I love jelly-o. Jujubes biscuit icing cookie marshmallow candy canes. I love pudding topping soufflé icing. Cake pudding dragée pudding marzipan ice cream lollipop I love. Ice cream chocolate cake dessert cake muffin sweet I love brownie biscuit.\n" +
            "\n" +
            "Pudding candy canes I love powder I love lemon drops chupa chups tiramisu caramels. I love pie sugar plum donut dessert. Soufflé I love tootsie roll sugar plum pie. Tart marzipan biscuit halvah. I love sweet roll I love dragée danish gummi bears. Brownie danish apple pie donut chupa chups. Jelly pudding tootsie roll.")
    val CheeseIpsum: MyData = MyData("Cheese Ipsum","Edam hard cheese everyone loves. Rubber cheese red leicester cheese slices pepper jack stilton ricotta swiss melted cheese. Swiss mozzarella manchego blue castello mozzarella roquefort gouda cheddar. Smelly cheese.\n" +
            "\n" +
            "Red leicester fondue feta. Cottage cheese swiss cheesy grin airedale fromage croque monsieur cheese triangles caerphilly. Emmental cheeseburger mascarpone macaroni cheese fromage frais caerphilly bavarian bergkase stinking bishop. Cheese and biscuits emmental jarlsberg chalk and cheese hard cheese when the cheese comes out everybody's happy stilton goat. When the cheese comes out everybody's happy macaroni cheese.\n" +
            "\n" +
            "Cheesecake say cheese danish fontina. Cheeseburger manchego squirty cheese when the cheese comes out everybody's happy manchego swiss cheese slices chalk and cheese. Cheese on toast blue castello cream cheese feta queso queso lancashire say cheese. Halloumi.\n" +
            "\n" +
            "Cheese strings bavarian bergkase babybel. Port-salut mascarpone queso mozzarella cheddar cheese triangles cheese slices brie. Swiss red leicester caerphilly macaroni cheese cheese slices cheddar airedale blue castello. Port-salut queso cream cheese stilton emmental babybel squirty cheese.\n" +
            "\n" +
            "Cheese strings pecorino rubber cheese. Melted cheese cheesecake paneer cut the cheese swiss cheddar feta cheeseburger. Cream cheese parmesan everyone loves danish fontina bavarian bergkase chalk and cheese rubber cheese mascarpone. Cheese and wine queso red leicester macaroni cheese manchego airedale halloumi red leicester. Cheesy grin.")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //assign so the binding know she have myData
        //binding.myData = myData
        binding.creatorButton.setOnClickListener {
            pickCreatorName(it)
        }
        binding.creatorText.setOnClickListener {
            changeCreatorName(it)
        }
        binding.pirateIpsum = PirateIpsum
        binding.cupcakeIpsum = CupcakeIpsum
        binding.cheeseIpsum = CheeseIpsum

        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.lorem_info,
            android.R.layout.simple_spinner_dropdown_item
        )
        binding.ipsumSpinner.adapter = adapter
        binding.ipsumSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val currentType: String = binding.ipsumSpinner.getItemAtPosition(p2).toString()
                when (currentType) {
                    "Pirate" -> {
                        binding.titleText.text = PirateIpsum.type
                        binding.loremText.text = PirateIpsum.content
                    }
                    "Cupcake" -> {
                        binding.titleText.text = CupcakeIpsum.type
                        binding.loremText.text = CupcakeIpsum.content
                    }
                    "Cheese" -> {
                        binding.titleText.text = CheeseIpsum.type
                        binding.loremText.text = CheeseIpsum.content
                    }
                }
            }

        }
}

    private fun pickCreatorName(view: View){
        binding.apply {
            creatorFillPlaceholder.visibility = View.GONE
            view.visibility = View.GONE
            creatorButton.visibility = View.GONE
            creatorText.visibility = View.VISIBLE
            ipsumSpinner.visibility = View.GONE
        }
        //hide keyboard
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)
    }

    private fun changeCreatorName(view: View){
        binding.apply {
            creatorFillPlaceholder.visibility = View.VISIBLE
            creatorButton.visibility = View.VISIBLE
            view.visibility = View.GONE
            creatorFillPlaceholder.requestFocus()

        }

        //make EditText editable
        creator_fill_placeholder.requestFocus()
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(creator_fill_placeholder,0)
    }
}
