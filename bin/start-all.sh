#!/usr/bin/env bash

./jarvis-daemon.sh restart logstorage
./jarvis-daemon.sh restart server
./jarvis-daemon.sh restart rest
./jarvis-daemon.sh restart worker