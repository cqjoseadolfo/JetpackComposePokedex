package com.plcoding.jetpackcomposepokedex.data.remote.respondes

data class HeldItem(
    val item: Item,
    val version_details: List<VersionDetail>
)