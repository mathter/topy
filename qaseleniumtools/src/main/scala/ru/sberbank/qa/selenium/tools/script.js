
var PLUGIN_DIALOG = 'plugin_Dialog';
var PLUGIN_WINDOW = window.open('', 'Tools', 'width=420,height=230,resizable=yes,scrollbars=yes,status=yes');

function plugin_attr(el, at, value){
	at = {'for': 'htmlFor', 'class': 'className'}[at] || at;
	if(!value){
		return el[at] || el.getAttribute(at) || '';
	}else{
	   if(at == 'style'){el.style.cssText = value; return;}
		el[at] = value;
       if (el.setAttribute)	el.setAttribute(at, value);
	}
}

function plugin_newElem(tag, params, doc){
	 params = params || {};
	 doc = doc || document;
	 var elem = doc.createElementNS ?
		doc.createElementNS( 'http://www.w3.org/1999/xhtml', tag ) :
		doc.createElement( tag );

	for(var pr in params){
		plugin_attr(elem, pr, params[pr]);
	}

	return elem;
}

function plugin_append(el, where, doc){
    doc = doc || document;
	(where || doc.body).appendChild(el);
}

function plugin_createDialog() {
    var root = plugin_newElem(
        'div',
        {
            id: PLUGIN_DIALOG,
            style: 'border: 1px solid red;'
        },
        PLUGIN_WINDOW.document
    );

    plugin_append(root, null, PLUGIN_WINDOW.document);

    return root;
}

function plugin_trace(destDoc, elem) {
    var dialog = PLUGIN_WINDOW.document.getElementById(PLUGIN_DIALOG);
    dialog.innerHTML = '<b>ID:</b> ' + elem.id + '<br/>' +
        '<b>Name:</b> ' + elem.name + '<br/>' +
        '<b>Tag name:</b> ' + elem.tagName + '<br/>' +
        '<b>Content:</b> ' + elem.innerText + '<br/>' +
        '<b>Value</b> ' + elem.value

}

plugin_createDialog();



document.oncontextmenu = function(e) {
    plugin_trace(PLUGIN_WINDOW.document, e.target)

    return false;
}