from flask import Flask,render_template

app = Flask(__name__,template_folder="templates")

@app.route('/')
def hello_world():
    return render_template('index.html')

@app.route('/aa')
def aa():
    return "aa"
@app.route('/bb')
def bb():
    return "bb"
@app.route('/cc')
def cc():
    return "cc"

#flask_app.py에 복붙.