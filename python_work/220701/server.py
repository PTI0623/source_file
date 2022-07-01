from flask import Flask

app=Flask(__name__)
def index():
    return "index"

app.run(host="192.168.0.43",port=5001)