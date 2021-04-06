function pagger(paggerId, pageIndex, totalPages) {
    var paggerEl = document.getElementById(paggerId);
    for (var i = 1; i <= totalPages; i++) {
        var child = document.createElement("li");
        if (i === pageIndex) {
            var current = document.createElement("span");
            current.innerHTML = pageIndex;
            child.appendChild(current);
        } else {
            var link = document.createElement("a");
            link.href = '?page=' + i;
            link.innerHTML = i;
            child.appendChild(link);
        }
        paggerEl.appendChild(child);
    }
}

