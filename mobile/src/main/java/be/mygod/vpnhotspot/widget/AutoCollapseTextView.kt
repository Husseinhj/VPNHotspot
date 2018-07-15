package be.mygod.vpnhotspot.widget

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import androidx.core.view.isVisible

class AutoCollapseTextView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null,
                                                     defStyleAttr: Int = android.R.attr.textViewStyle) :
        AppCompatTextView(context, attrs, defStyleAttr) {
    override fun onTextChanged(text: CharSequence?, start: Int, lengthBefore: Int, lengthAfter: Int) {
        super.onTextChanged(text, start, lengthBefore, lengthAfter)
        isVisible = !text.isNullOrEmpty()
    }
}
