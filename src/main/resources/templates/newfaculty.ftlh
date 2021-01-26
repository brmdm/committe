<#import "parts/common.ftlh" as c>
<#import "/spring.ftl" as spring>
<@c.page>
    ${message?ifExists}
    <a class="btn btn-primary" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false"
       aria-controls="collapseExample">
        <@spring.message "faculty.addnew"/>
    </a>

    <div class="collapse" id="collapseExample">
        <div class="form-group mt-3">
            <form method="post" enctype="multipart/form-data">
                <div class="form-group">
                    <input type="text" name="title" class="form-control" placeholder="<@spring.message "faculty.title"/>"/>
                </div>
                <div class="form-group">
                    <input type="text" name="allPlaces" class="form-control" placeholder="<@spring.message "main.totalplaces"/>"/>
                </div>
                <div class="form-group">
                    <input type="text" name="budgetPlaces" class="form-control" placeholder="<@spring.message "main.budgetplaces"/>">
                </div>
                <input type="hidden" name="_csrf" value="${_csrf.token}"/>
                <div class="form-group">
                    <button type="submit" class="btn btn-primary"><@spring.message "faculty.addnew"/></button>
                </div>
            </form>
        </div>
    </div>
</@c.page>