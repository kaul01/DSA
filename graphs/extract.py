from bs4 import BeautifulSoup

html = open("web.html").read()
soup = BeautifulSoup(html, "html.parser")

url_chars = []

# find all <section> elements that match the pattern
for section in soup.find_all("section", attrs={"data-id": True}):
    if not section["data-id"].startswith("92"):
        continue
    article = section.find("article", attrs={"data-class": True})
    if not article or not article["data-class"].endswith("45"):
        continue
    div = article.find("div", attrs={"data-tag": True})
    if not div or "78" not in div["data-tag"]:
        continue
    b_tag = div.find("b", class_="ref", attrs={"value": True})
    if b_tag:
        url_chars.append(b_tag["value"])

hidden_url = "".join(url_chars)
print(hidden_url)