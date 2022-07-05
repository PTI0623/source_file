from flask import Flask,render_template

app = Flask(__name__,template_folder="templates")

@app.route('/')
def hello_world():
    num=10
    myst="DB에서 읽은 내용"
    if num>10:
        result="num은 10보다 크다."
    return render_template('index.html',num=num,myst=myst,result=result)

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