$(document).ready(function() {
	$(".movie").click(function(movieId) {
    		var movieId = $(this).attr('movieId')
		$.ajax({
        		url: "/movies/"+movieId
    		}).then(function(data) {
       			$('.movie-title').empty().append(data.title);
       			$('.movie-director').empty().append(data.director);
       			$('.movie-cast').empty().append(data.cast);
    		});
	});
});
