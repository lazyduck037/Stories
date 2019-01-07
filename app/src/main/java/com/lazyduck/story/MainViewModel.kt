package com.lazyduck.story

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import com.lazyduck.story.api.ApiService
import javax.inject.Inject

/**
 * @author datto
 */
class MainViewModel :  ViewModel {
    var context:Context
    var api:ApiService

    @Inject
    constructor(context: Context,api: ApiService):super(){
        this.context = context
        this.api = api
    }

}