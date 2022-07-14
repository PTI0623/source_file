class Friend:
    #생성자
    def __init__(self, name, phone):
        self.name = name
        self.phone = phone

    #toString() 객체받을때 내용
    def __str__(self):
        return f"self.name = {self.name} self.phone = {self.phone}"

    def get_name(self):
        return self.name

    def get_phone(self):
        return self.phone

    def set_name(self, name):
        self.name = name

    def set_phone(self, phone):
        self.phone = phone
