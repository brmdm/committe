<#import "parts/common.ftlh" as c>
<#import "parts/pager.ftlh" as p>
<#import "/spring.ftl" as spring>
<#include "parts/security.ftlh">
<@c.page>
    <h5><@spring.message "main.hello"/>, ${name}</h5>
    <@p.pager url page />
        <div class="card-columns">
            <#list page.content  as faculty>
                <div class="card my-3" style="width: 18rem;">
                    <h5 class="card-title">  ${faculty.title}.</h5>
                    <b><@spring.message "main.totalplaces"/>: ${faculty.allPlaces}. </b>
                    <div class="m-2">
                        <i><@spring.message "main.budgetplaces"/>: ${faculty.budgetPlaces}.</i>
                    </div>
                    <div class="card-footer text-muted">
                        <@spring.message "main.interest"/> <a href="/faculty/${faculty.id}"><@spring.message "main.apply"/></a>
                    </div>

                </div>
            </#list>
        </div>
    <@p.pager url page />

</@c.page>