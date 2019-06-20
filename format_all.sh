#!/usr/bin/env bash

kotlinc -script -verbose _update_drawables.kts
kotlinc -script -verbose _format_strings.kts
kotlinc -script -verbose _format_gradle.kts