package com.bendeliani.controller

import com.amazonaws.util.EC2MetadataUtils
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1")
class AppController {

    @GetMapping(
        path = ["/info"],
        produces = [MediaType.APPLICATION_JSON_VALUE]
    )
    fun info(): EC2Info {
        val info = EC2MetadataUtils.getInstanceInfo()
        val region = info.region
        val az = info.availabilityZone
        return EC2Info(region, az)
    }
}

data class EC2Info(val region: String, val availabilityZone: String)
