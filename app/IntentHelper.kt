import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import java.nio.ByteOrder

/*fun openIntent(activity: Activity, order: String, activityClass: Class<*>) {
    val intent = Intent(activity, activityClass)
    intent.putExtra("productName", order)
    activity.startActivity(intent)
}*/

class IntentHelper {

/*fun shareIntent(activity:Activity,Order: String, activityClass: Class<*>){
   // var  order= Order();

    var sendIntent = Intent()
    sendIntent.setAction(Intent.ACTION_SEND)

//create a bundle and add multiple values to it
   var shareOrderDetails = Bundle()
    shareOrderDetails.putString("product Name", order.productName)
    shareOrderDetails.putString("customerName", order.customerName)
    shareOrderDetails.putString("customerCell", order.customerCell)

    //share the whole bundle
    sendIntent.putExtra(Intent.EXTRA_TEXT,shareOrderDetails)
    sendIntent.setType("text/plain")

    //
    var shareIntent = Intent.createChooser(sendIntent, null)
    activity.startActivity(shareIntent)
}*/

}