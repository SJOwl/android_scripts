#!/usr/bin/env bash

kotlinc -script -verbose ./kotlin/_update_drawables.kts
kotlinc -script -verbose ./kotlin/_format_strings.kts
kotlinc -script -verbose ./kotlin/_format_gradle.kts